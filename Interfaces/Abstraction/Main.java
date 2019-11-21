package com.prashant;

public class Main {

    public static void main(String[] args) {
     Dog dog = new Dog("Yorkiee");
     dog.eat();
     dog.breathe();

     Parrot parrot = new Parrot("Australian ringneck");
     parrot.eat();
     parrot.breathe();
     parrot.fly();

     Penguin penguin = new Penguin("Emperor");
     penguin.fly();
    }
}


/*Notes
* Difference between the abstract class and the interface
* an abstract class can have member variables that are inheriated something that can't be done in the interface.
* Interface can have variables but they all are public static final variables which are constant values that we never be change with static scope.
* They have to be static because non-static variables require instance and acoss we can't instantiate an Interface.
*Interfaces also cannot have constructors but abstract classes can have the constructors
* All methods of the Interface are autometically public, where as methods of the abstract class can have any visibility exe private protected etc.
*
* Abstract classes can have defined methods,the method with the implementation,where as all methods in the Interface are abstract.*/