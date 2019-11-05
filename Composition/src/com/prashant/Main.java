package com.prashant;

import java.awt.*;

public class Main {
//composition is creating objects within the objects
    //Look composition before inheritance as a general rule
    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2208B","HP","220V", dimensions); //1.create
                 //a new dimension class

        Monitor monitor = new Monitor("HP2005","HP",27,
                new Resolution(2540,1440)); //this creates a instance of a
                                         // class without creating a variable

        Motherboard motherboard = new Motherboard("BJ-200","Asus",
                4,4,"v2.44");

        PC thePc = new PC(theCase,monitor,motherboard);

        //How do we access drawPixelAt in the Monitor class from our PC
//        thePc.getMonitor().drawPixelAt(1500,1200,"BLUE");
//        thePc.getMotherboard().loadProgram("Windows10");
//        thePc.getTheCase().getPowerSupply();

        thePc.powerUp();

    }
}
