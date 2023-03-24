package org.example.DisneyAPI;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DisneyCastViewer {
    final static String ROOT_URL = "https://api.disneyapi.dev/character";
    public static String getFilm(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your favorite Disney film title");
        String film = scan.nextLine();
        return film;
    }

    //GOAL: take in a movie name and return formatted URL
    //parameter --> String filmTitle and ROOT_URL
    //return --> String URL
    public static String formatURL(String URL, String filmTitle){
        filmTitle = filmTitle.replaceAll(" ", "%20");
        filmTitle = filmTitle.replaceAll("'", "%27");
        String bigBoyURL = URL + "?" + "films=" + filmTitle;
        return bigBoyURL;
    }

    public static String letsGETit(String URL){
        HttpClient client = HttpClient.newHttpClient(); //connect to the internet
        URI uri = URI.create(URL); //URI: Uniform Resource Identifier is an umbrella term for URL
        HttpRequest request = HttpRequest.newBuilder() //this object holds data about the query
                .uri(uri)
                .header("Accept", "application/json") //holds meta-data(data about data)
                .GET()
                .build();
        try {
            HttpResponse<String> httpResponse = client.send(request, HttpResponse.BodyHandlers.ofString());
            int statusCode = httpResponse.statusCode(); //a secret code that tells you how it went
            //in general, 200s are good, 400-500s are bad
            if (statusCode == 200) { //means everything went OK
                return httpResponse.body();//the body has the JSON
            } else {
                // String.format is fun! Worth a Google if you're interested
                return String.format("GET request failed: %d status code received", statusCode);
            }
        } catch (IOException | InterruptedException e) {
            return e.getMessage();
        }
    }

    public static CastDTO convert(String json){
        ObjectMapper mapper = new ObjectMapper();
        try{
            CastDTO dto = mapper.readValue(json, CastDTO.class);
            return dto;
        } catch (Exception e){
            System.out.println("Something went wrong");
            return null;
        }
    }

    //GOAL: Take a list of characters, return the URLs
    //DATA TYPE: String URL
    //if statement on the movie name
    public static List<String> grabURLs(List<Data> characters, String film){
        ArrayList<String> images = new ArrayList<>();
        for (Data character : characters) {
            if (character.getFilms().contains(film)){
                String image = character.getImageUrl();
                images.add(image);
            }
        }
        return images;
    }

    //GOAL: write an HTML file that has all the image URLs
    public static void writeToFile(List<String> imageURLs){
        try {
            FileWriter fw = new FileWriter("index.html");
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write("<html>\n");
            writer.write("<head></head>\n");
            writer.write("<body>\n");
            //TODO: insert image links
            for (int i = 0; i < imageURLs.size(); i++){
                String currURL = imageURLs.get(i);
                writer.write("<img src =\"");
                writer.write(currURL);
                writer.write("\">\n");
            }
            writer.write("</body>");
            writer.write("</html>");


            writer.close();
            //DON'T FORGET TO CLOSE!!
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        String film = getFilm();
        System.out.println(film);
        String URL = formatURL(ROOT_URL, film);
        System.out.println(URL);
        String json = letsGETit(URL);
        System.out.println(json);
        CastDTO dto = convert(json);
        List<Data> characters = dto.getData();
        System.out.println(grabURLs(characters, film));
        writeToFile(grabURLs(characters, film));
        /*
        System.out.println(characters.get(0).getName());
        for (Data character : characters) {
            if (character.getFilms().contains(film)){
                System.out.println(character.getName());
                //System.out.println(character.getFilms().contains(film));
            }

        }
         */


    }
}
