package com.prashant;

public class Main {

    public static void main(String[] args) {
	  Wall wall1 = new Wall("East");
	  Wall wall2 = new Wall("West");
	  Wall wall3 = new Wall("North");
	  Wall wall4 = new Wall("South");

	  Ceiling ceiling = new Ceiling(12,55);
	  Bed bed = new Bed("Modern",4,1,1);
	  Lamp lamp = new Lamp("Autometic",true,4);
	  Bedroom bedroom = new Bedroom("Kumar's",wall1,wall2,wall3,wall4,ceiling,bed,lamp);

	  bedroom.makeBed();
	  bedroom.getLamp().turnOn(); //this is composition
        //as a general rule you go for composition
    }
}
