package com.example.cardviewapp;

public class Sport {
    public int sportImage;
    public String sportName;

    public Sport(int sportImage, String sportName) {
        this.sportImage = sportImage;
        this.sportName = sportName;
    }

    public int getSportImage() {
        return sportImage;
    }

    public void setSportImage(int sportImage) {
        this.sportImage = sportImage;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }
}
