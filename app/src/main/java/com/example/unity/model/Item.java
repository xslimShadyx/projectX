package com.example.unity.model;

public class Item {
    private  String title;
    private int time ;
    private  String description;
    private  String offer ;
    private  int people ;


    public Item(int time,String description ,String offer ,int people,String title){

        this.time= time;
        this.description= description;
        this.offer=offer;
        this.people= people;
        this.title= title;

    }


    public int getPeople() {
        return people;
    }

    public int getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public String getOffer() {
        return offer;
    }

    public String getTitle() {
        return title;
    }
}
