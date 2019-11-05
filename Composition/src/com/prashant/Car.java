package com.prashant;

public class Car extends Vehicle {
    private int door;
    private int engineCapacity;
 //This is is-a relationship means Car is-a Vehicle(Inheritance)
        public Car(String name, int doors, int engineCapacity){
            super(name);
            this.door = doors;
            this.engineCapacity = engineCapacity;
        }
}
