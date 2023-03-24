package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class StarWars {
    public static void main(String[] args) {
        String link = "https://swapi.py4e.com/api/films/1/";
        System.out.println(grabTitle(link));
        String[] titles = getAllMovieTitles(10);
        for (String t : titles) {
            System.out.println(t);
        }
    }

    //GOAL: Given a personID, return the list of movie titles they were in

    public static String[] getAllMovieTitles(int personID){
        String URL = "https://swapi.py4e.com/api/people/" + personID + "/";
        String jsonResponse = APIConnector.makeGETRequest(URL);
        ObjectMapper mapper = new ObjectMapper();
        PeopleDTO dto = null;
        try {
            dto = mapper.readValue(jsonResponse, PeopleDTO.class);
        } catch (Exception e) {
            return null;
        }
        List<String> filmURLs = dto.getFilms();
        //basket (String[] -> need a size?
            //how big should basket be? same number as URLS?
        //dt[] name = new dt[size]
        String[] basket = new String[filmURLs.size()];
        //loop
        for (int i = 0; i < filmURLs.size(); i++){
            //fill up the basket (with titles?)
            String title = grabTitle(filmURLs.get(i));
            basket[i] = title;
        }
        return basket;
    }

    //GOAL: Given the film URL, return the title
    public static String grabTitle(String filmURL){
        String response = APIConnector.makeGETRequest(filmURL);
        ObjectMapper mapper = new ObjectMapper();
        try {
            FilmDTO filmDTO = mapper.readValue(response, FilmDTO.class);
            return filmDTO.getTitle();
        } catch (Exception e){
            return "Title Not Found";
        }
    }

}
