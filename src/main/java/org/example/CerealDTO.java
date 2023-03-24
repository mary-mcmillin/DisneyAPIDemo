package org.example;

public class CerealDTO {
   private int id;
   private String type;
   private String name;
   private String base;
   private double calories;
   private String[] marshmallows;

   public int getId(){
       return id;
   }

   public void setId(int id){
       this.id = id;
   }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBase() {
        return base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    public double getCalories() {
        return calories;
    }

    public void setCalories(double calories) {
        this.calories = calories;
    }

    public String[] getMarshmallows() {
        return marshmallows;
    }

    public void setMarshmallows(String[] marshmallows) {
        this.marshmallows = marshmallows;
    }
}
