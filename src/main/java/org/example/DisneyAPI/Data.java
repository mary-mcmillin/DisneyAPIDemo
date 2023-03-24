package org.example.DisneyAPI;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Data {
    @JsonProperty("url")
    private String url;
    @JsonProperty("imageUrl")
    private String imageUrl;
    @JsonProperty("name")
    private String name;
    @JsonProperty("enemies")
    private List<String> enemies;
    @JsonProperty("allies")
    private List<String> allies;
    @JsonProperty("parkAttractions")
    private List<String> parkAttractions;
    @JsonProperty("videoGames")
    private List<String> videoGames;
    @JsonProperty("tvShows")
    private List<String> tvShows;
    @JsonProperty("shortFilms")
    private List<String> shortFilms;
    @JsonProperty("films")
    private List<String> films;
    @JsonProperty("_id")
    private int _id;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getEnemies() {
        return enemies;
    }

    public void setEnemies(List<String> enemies) {
        this.enemies = enemies;
    }

    public List<String> getAllies() {
        return allies;
    }

    public void setAllies(List<String> allies) {
        this.allies = allies;
    }

    public List<String> getParkAttractions() {
        return parkAttractions;
    }

    public void setParkAttractions(List<String> parkAttractions) {
        this.parkAttractions = parkAttractions;
    }

    public List<String> getVideoGames() {
        return videoGames;
    }

    public void setVideoGames(List<String> videoGames) {
        this.videoGames = videoGames;
    }

    public List<String> getTvShows() {
        return tvShows;
    }

    public void setTvShows(List<String> tvShows) {
        this.tvShows = tvShows;
    }

    public List<String> getShortFilms() {
        return shortFilms;
    }

    public void setShortFilms(List<String> shortFilms) {
        this.shortFilms = shortFilms;
    }

    public List<String> getFilms() {
        return films;
    }

    public void setFilms(List<String> films) {
        this.films = films;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }
}
