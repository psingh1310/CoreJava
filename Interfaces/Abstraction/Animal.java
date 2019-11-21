package com.prashant;

public abstract class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }

    //abstract method
    public abstract void eat();
    public abstract void breathe();

    public String getName() {
        return name;
    }
}
