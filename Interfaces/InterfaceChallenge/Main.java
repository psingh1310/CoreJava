package com.prashant;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Player kumar = new Player("Kumar",10,15);
        System.out.println(kumar.toString());
        saveObject(kumar);

        kumar.setHitPoints(8);  //SetterMethod
        System.out.println(kumar);
        kumar.setWeapon("Stormbringer");
        saveObject(kumar);
      //  loadObject(kumar);
        System.out.println(kumar);


        ISavable wereWolf = new Monster("WereWolf",25,40);

       // Monster wereWolf = new Monster("WereWolf",25,40);   /*If we go with this then the below code works*/
        //wereWolf.getStrength;
        System.out.println("Strength = " + ((Monster) wereWolf).getStrength());  //We actually typecasted here

        System.out.println(wereWolf);
        saveObject(wereWolf);


    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

/*we are passing as parameter the ISavable using the ISavable Interface by doing that we can use any object that is
* used in this interface, This method is used to save any type of class which is very powerful */
//This method takes the any class that implements the ISavable Interface

    public static void saveObject(ISavable objectToSave){
        for (int i=0; i<objectToSave.write().size(); i++){
            System.out.println("Saving " +objectToSave.write().get(i) + " To storage device");
        }
    }

    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }

}
