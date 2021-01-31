package com.example.unity.model;

import java.sql.Time;

public class Card {
    private String title;
    private String place;
    private Time time;
   private String info;
    private String offer;
    private String need;

    Card(String title,String place,Time time,String info,String offer,String need){
        this.info=info;
        this.time=time;
        this.need=need;
        this.offer=offer;
        this.title=title;
        this.place=place;
    }

    public String getTitle() {
        return title;
    }

    public String getOffer() {
        return offer;
    }

    public String getInfo() {
        return info;
    }

    public String getNeed() {
        return need;
    }

    public String getPlace() {
        return place;
    }

    public Time getTime() {
        return time;
    }
}
