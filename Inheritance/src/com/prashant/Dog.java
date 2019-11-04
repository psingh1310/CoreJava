package com.prashant;

public class Dog extends Animal {
    //unique characteristics of the dog class (Fields)
    private int eyes;
    private int legs;
    private int tail;
    private int teeth;
    private String coat;

 //in addition dog class also have these characteristics from Animal class

//    public Dog(String name, int brain,int body, int size, int weight){
//      super(name, brain, body, size, weight);
//      //super means call the constructor that is for the class that we are extending from
//    }
//

    public Dog(String name,int size, int weight,int eyes,int legs, int tail, int teeth, String coat){
        super(name,1, 1, size, weight);
        //super means call the constructor that is for the class that we are extending from
        //now initialize the fields
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog.chew() method is called");
    }

    //overriding the eat method


    @Override
    public void eat() {
        System.out.println("Dog.eat() is called");
        chew();
        super.eat();  //super calls the parent class
    }

    public void walk(){
        System.out.println("dog.walk() method is called");
        //call the move method in the super class
        //even if you have move method in this class
        super.move(5);
    }
    public void run(){
        System.out.println("dog.run method is called");
        move(10);
    }
    private void moveLegs(int speed){
        System.out.println("Dog.moveLegs() is called");
    }

    @Override
    public void move(int speed) {
        System.out.println("dog.move() is called");
        moveLegs(speed);
        super.move(speed);
    }
}
