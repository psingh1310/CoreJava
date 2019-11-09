package com.prashant;

import java.util.ArrayList;

public class GroceryList {
    //ArrayList is a class
    private ArrayList<String> grocerryList = new ArrayList<String>();

   //adding item in the list
    public void addGrocerryItem(String item){
        grocerryList.add(item);
    }

    //printing item from the list
    public void printGrocerryList(){
        System.out.println("You have "+ grocerryList.size() +" item in your list");
        for (int i = 0; i < grocerryList.size(); i++){
            System.out.println((i+1) +". " + grocerryList.get(i));
        }
    }

    //replacing item in list
    public void modifyGrocerryItem(int position, String newItem) {
           grocerryList.set(position, newItem);
        System.out.println("Grocerry " + (position+1) + " has been modified");
    }

    //Remove an item from
    public void removeGrocerryitem(int position){
        //retreve the item first
        String theItem = grocerryList.get(position);
        grocerryList.remove(position);
    }

    //Find items in the GrocerryList
    public String findItem(String searchItem){
        //contains function
    //    boolean exists = grocerryList.contains(searchItem); //this tells item is in list or not
        //But we also have to return the item
        //IndexOf returns the index of the searched item
        int position = grocerryList.indexOf(searchItem);

        if (position >= 0){
            return grocerryList.get(position);
        }
        return null;
    }
}
