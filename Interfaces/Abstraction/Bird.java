package com.prashant;

public abstract class Bird extends Animal implements CanFly {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is pecking");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in Breathe out");
    }

    //abstract method of the Bird class which is also a abstract class
    //fly method is a abstract method which is going to be implemented by the
    //birds which fly.
   // public abstract void fly();

    //Now overriding the fly Method from the interface CanFly
    @Override
    public void fly() {
        System.out.println(getName() + " is flapping its wings");
    }
}
