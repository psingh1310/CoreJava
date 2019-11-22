package com.prashant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	/*Generics allow us to create classes, interfaces and methods that take type as parameters.*/
        /*Generics in Java is similar to templates in C++. The idea is to allow type
         (Integer, String, … etc and user defined types) to be a parameter to methods, classes and interfaces.
         For example, classes like HashSet, ArrayList, HashMap, etc use generics very well.*/

        ArrayList<Integer> items = new ArrayList<>();
        items.add(1);
        items.add(2);
        items.add(3);
     //   items.add("Kumar");  //it fails at compile time not at run time
        items.add(4);
        items.add(5);
        //here we are doing autoboxing autometically
        printDouble(items);
    }
    private static void printDouble(ArrayList<Integer> n){
        for(int i : n){
            System.out.println(i * 2);
            //here we have type of Object is in the arrayList(Integer)
        }
    }
}
