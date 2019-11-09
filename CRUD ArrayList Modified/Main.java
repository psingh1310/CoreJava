package com.prashant;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {

        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit){
            System.out.println("Enter your choice");
            choice = scanner.nextInt();
            scanner.nextLine(); //to clear the buffer

            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGrocerryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions(){
        System.out.println("\nPress");
        System.out.println("\t 0 - To print choice options. ");
        System.out.println("\t 1 - To print list of the grocerry item. ");
        System.out.println("\t 2 - To add grocery in the list. ");
        System.out.println("\t 3 - To modify item in the list. ");
        System.out.println("\t 4- To remove item from the list. ");
        System.out.println("\t 5- To search for item in the list. ");
        System.out.println("\t 6- To copy the ArrayList. ");
        System.out.println("\t 7- to quit the process. ");
    }

    public static void addItem(){
        System.out.print("Enter the grocery item: ");
        groceryList.addGrocerryItem(scanner.nextLine());
    }

    public static void modifyItem(){
        System.out.print("Enter item name: ");
        String itemNumber = scanner.nextLine();
        //scanner.nextLine(); // clear the buffer
        System.out.print("Enter Replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGrocerryItem(itemNumber,newItem);
        // -1 to access the correct position
    }

    public static void removeItem(){
        System.out.print("Enter the item name");
        String itemNumber = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGrocerryitem(itemNumber);
    }

    public static void searchForItem(){
        System.out.print("Enter the item to search for");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)){
            System.out.println("Found " + searchItem + " in our grocery list");
        } else
        {
            System.out.println(searchItem + " is not in the shopping list");
        }
    }

    //Adding entire contents to a new array
    public static void processArrayList(){
        //way to copy one array list on to the another array list
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGrocerryList());


        //one another very efficient way to copy the whole arrayList(both above and below are identical)
        ArrayList<String> nextArry = new ArrayList<String>(groceryList.getGrocerryList());


        //take the contents of the arrayList and convert into the regular array
        String [] myArray = new String[groceryList.getGrocerryList().size()];
        myArray = groceryList.getGrocerryList().toArray(myArray);
           for (String newitem : myArray){
               System.out.println(newitem);
           }

     }
}
