package com.prashant;

public class Song {
    private String title;
    private double duration;

    public Song(String title,double duration){
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    //overriding the toString method of the String Class
    //If we not override it then has code is going to be printed.
    @Override
    public String toString() {
        return this.title + " : " + this.duration;
    }
}
