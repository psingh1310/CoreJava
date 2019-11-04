package com.prashant;

public class Main {

    public static void main(String[] args) {
	Animal animal = new Animal("Animal", 1, 1,5,13);

	Dog dog = new Dog("Yorkie",8,20,2,
            4,1,20, "longsilky");

	// dog.eat(); //we are able to access the part of the animal class
             //as dog is inherited from animal class
	dog.walk();
	dog.run();

	Fish fish = new Fish("Zander",4,3,2,2,2);
      fish.swim(10);
    }
}
