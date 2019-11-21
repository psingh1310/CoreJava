package com.prashant;

public class Penguin extends Bird{

    public Penguin(String name) {
        super(name);
    }
//This overriden method we leave because this dshow some specific functionality of penguin class
    @Override
    public void fly() {
        super.fly();
        System.out.println("I am not very good at that," +
                "I will rather swim instead.");
    }
}
