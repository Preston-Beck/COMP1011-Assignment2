package com.example.comp1011assignment2.Model;

public class TimeZone {
    public String id;
    public int offset;
    public String tz;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }

    public String toString(){
        return String.format("%s", tz);
    }
}
