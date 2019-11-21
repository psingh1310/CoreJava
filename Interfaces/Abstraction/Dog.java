package com.prashant;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    //Overriding the abstract methods

    @Override
    public void eat() {
        System.out.println(getName() + " is eating");
    }

    @Override
    public void breathe() {
        System.out.println("breathing");
    }
}
