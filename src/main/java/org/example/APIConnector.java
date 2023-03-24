package org.example;

import java.io.IOException;
import java.util.Scanner;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class APIConnector {

    //GOAL: Write a method, that takes in a json String, and returns a BabyTVDTO

    public static BabyTVDTO convertBaby(String jsonString){
        ObjectMapper mapper = new ObjectMapper();
        try {
            BabyTVDTO dto = mapper.readValue(jsonString, BabyTVDTO.class);
            return dto;
        } catch (Exception e){
            System.out.println(e.getMessage());
            return null;
        }
    }

    public static String makeGETRequest(String url){
        //setting up the query/call
        HttpClient client = HttpClient.newHttpClient(); //connect to the internet
        URI uri = URI.create(url); //URI: Uniform Resource Identifier is an umbrella term for URL
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
                return httpResponse.body();
            } else {
                // String.format is fun! Worth a Google if you're interested
                return String.format("GET request failed: %d status code received", statusCode);
            }
        } catch (IOException | InterruptedException e) {
            return e.getMessage();
        }
    }

    public static void main(String[] args) {
        //GOAL #1; make a dynamic url
        //I want to use Scanner to read in a tvshow
        //ANd then I want to build the URL for that show
        //https://api.tvmaze.com/singlesearch/shows?q=cutthroat%20kitchen

        final String ROOT_URL = "api.tvmaze.com";
        final String PROTOCOL = "https://";
        String path = "/singlesearch/shows";

        //3 steps for user input
        //0. import scanner
        //1. init the scanner
        Scanner scan = new Scanner(System.in);
        //2. prompt the user(tell them what we need!)
        System.out.println("Enter the name of a tv show");
        //3. recieve the input
        String tvShowInput = scan.nextLine();

        String queryValue = tvShowInput.replaceAll(" ", "%20").replaceAll("'", "%27");
        queryValue = queryValue.toLowerCase();

        String URL = PROTOCOL + ROOT_URL + path + "?q=" + queryValue;
        System.out.println(URL);

        String jsonResponse = makeGETRequest(URL);
        System.out.println(jsonResponse);
        BabyTVDTO DTO = convertBaby(jsonResponse);
        System.out.println("Show Name: " + DTO.getName());
        System.out.println("Show Language: " + DTO.getLanguage());

        //what time does this show air?
            //gonna need to:
                //make the TVDTO with the data
                //get the schedule
                //then, get the time
        ObjectMapper mapper = new ObjectMapper();
        try {
            TVDTO tvdto = mapper.readValue(jsonResponse, TVDTO.class);
            System.out.println(tvdto.getSchedule().getTime());
        } catch (Exception e){
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
