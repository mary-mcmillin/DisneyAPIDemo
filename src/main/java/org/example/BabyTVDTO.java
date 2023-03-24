package org.example;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true) //This is so we don't have to have everything
public class BabyTVDTO {
    //Properties
    private String name;
    private String language;
    private String summary;

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
