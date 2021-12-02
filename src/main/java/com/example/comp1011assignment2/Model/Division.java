package com.example.comp1011assignment2.Model;

public class Division {
    public int id;
    public String name;
    public String nameShort;
    public String link;
    public char abbreviation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNameShort() {
        return nameShort;
    }

    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public char getAbbreviation() {
        return abbreviation;
    }

    public void setAbbreviation(char abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String toString(){
        return String.format("%s", name);
    }
}
