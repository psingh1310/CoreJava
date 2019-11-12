package com.prashant;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
     Customer customer = new Customer("Kumar",1200.00);  //(first class)
     Customer  anotherCustomer;   //assigning another customer to the Customer(Second class or another instance)
     anotherCustomer = customer;   //assignment  (both are using the same memory address)
        //anotherCustomer -> customer
     anotherCustomer.setBalance(1000.00);
     //why does changing the balance of second class affect the first class??
        // because both are pointing to the same address
        System.out.println("Balance of " +customer.getName() + " is " +customer.getBalance());


        ArrayList<Integer> intList = new ArrayList<Integer>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        intList.add(4);

        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }

//        for (int printList : intList){
//            System.out.println(printList + " : " + intList.get(printList - 1));
//        }


        intList.add(1,7);
        for (int i = 0; i < intList.size(); i++){
            System.out.println(i + " : " + intList.get(i));
        }

    }
}
