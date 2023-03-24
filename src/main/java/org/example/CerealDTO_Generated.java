package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class CerealDTO_Generated {
    @JsonProperty("marshmallows")
    private List<String> marshmallows;
    @JsonProperty("calories")
    private double calories;
    @JsonProperty("base")
    private String base;
    @JsonProperty("name")
    private String name;
    @JsonProperty("type")
    private String type;
    @JsonProperty("id")
    private int id;

    public List<String> getMarshmallows() {
        return marshmallows;
    }

    public void setMarshmallows(List<String> marshmallows) {
        this.marshmallows = marshmallows;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
