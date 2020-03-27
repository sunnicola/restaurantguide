package com.example.restaurantguide;

import android.media.Image;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Restaurant {
    private int img;
    private String name;
    private String cuisine;
    private String location;
    private double rating;
    private int cost;

    // empty default constructor
    public Restaurant(){
    }



    public Restaurant(int img, String name, String cuisine, String location, double rating, int cost){
        this.img = img;
        this.name = name;
        this.cuisine = cuisine;
        this.location = location;
        this.rating = rating;
        this.cost = cost;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCuisine() {
        return cuisine;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }



    public static ArrayList<Restaurant> getRestaurant(){
        ArrayList<Restaurant> restaurants = new ArrayList<>();
        restaurants.add(new Restaurant(R.drawable.malay,"Holy Basil","Thai","Town Hall",4.7,35));
        restaurants.add(new Restaurant(R.drawable.pasta,"Macchiato","Italian","Town Hall",4.5,40));
        restaurants.add(new Restaurant(R.drawable.cafe,"Son of a Baker","Australian","Sans Souci",4.5,40));
        restaurants.add(new Restaurant(R.drawable.middleeast,"El Jannah","Middle Eastern","Kogarah",3.7,20));
        restaurants.add(new Restaurant(R.drawable.tacos,"Contrabando","Mexican","Martin Place",4.3,35));
        restaurants.add(new Restaurant(R.drawable.malay,"Mamak","Malaysian","Chinatown",4,35));
        restaurants.add(new Restaurant(R.drawable.malay,"Ho Jiak","Malaysian","Haymarket", 4.7,50));
        restaurants.add(new Restaurant(R.drawable.malay,"Strathfield BBQ","Korean","Strathfield",4,60));
        restaurants.add(new Restaurant(R.drawable.sushi,"Sushi Rio","Japanese","Town Hall",3.7,30));
        restaurants.add(new Restaurant(R.drawable.cafe,"Bourke Street Bakery","Australian","Surry Hills",4.2,20));
        restaurants.add(new Restaurant(R.drawable.burgers,"Mary's Burgers","American","Newtown",3.9,30));
        return restaurants;
    }

}

