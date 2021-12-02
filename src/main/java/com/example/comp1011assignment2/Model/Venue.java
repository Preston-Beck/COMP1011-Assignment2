package com.example.comp1011assignment2.Model;

public class Venue {
    public String name;
    public String link;
    public String city;
    public TimeZone timeZone;

    public String toString(){
        return String.format("%s in %s",name, city);
    }
}
