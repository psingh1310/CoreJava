package com.prashant;

public class Main {

    public static void main(String[] args) {
        Car honda = new Car();
	       //honda is a datatype of type Car
        Car tata = new Car();
        System.out.println("Model is " + honda.getModel());
        honda.setModel("Hondacivic");
        tata.setModel("tatahexa");
        System.out.println("Model is " + honda.getModel());
        System.out.println("Model is " + tata.getModel());
    }
}
