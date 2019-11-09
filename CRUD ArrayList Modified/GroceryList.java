package com.prashant;

import java.util.ArrayList;

public class GroceryList {
    //ArrayList is a class
    private ArrayList<String> grocerryList = new ArrayList<String>();

   //adding item in the list
    public void addGrocerryItem(String item){
        grocerryList.add(item);
    }
   //getter to copy the whole array
    public ArrayList<String> getGrocerryList() {
        return grocerryList;
    }

    //printing item from the list
    public void printGrocerryList(){
        System.out.println("You have "+ grocerryList.size() +" item in your list");
        for (int i = 0; i < grocerryList.size(); i++){
            System.out.println((i+1) +". " + grocerryList.get(i));
        }
    }


    public void modifyGrocerryItem (String currentItem,String newItem){
        int position = findItem(currentItem);
        if (position >= 0){
            modifyGrocerryItem(position,newItem);
        }
    }


    //replacing item in list
    private void modifyGrocerryItem(int position, String newItem) {
           grocerryList.set(position, newItem);
        System.out.println("Grocerry " + (position+1) + " has been modified");
    }

    public void removeGrocerryitem(String item){

        int position = findItem(item);
        if (position >= 0){
            removeGrocerryitem(position);
        }

    }

    //Remove an item from
    private void removeGrocerryitem(int position){

        grocerryList.remove(position);
    }

    //Find items in the GrocerryList
    private int findItem(String searchItem){
      return grocerryList.indexOf(searchItem);
    }

    public boolean onFile(String searchItem){
        int position = findItem(searchItem);
        if (position >= 0){
            return true;
        }

        return false;
    }
}
