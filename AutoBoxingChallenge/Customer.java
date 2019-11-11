package com.prashant;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialAmount){
        this.name = name;
        //add the initial amount
        this.transactions = new ArrayList<Double>(); //initialize the arrayList
        addTransaction(initialAmount); //initial amount get added into the arrayList
    }

    //add transaction method for the customer when he return back after first transaction
    //double amount -> primitive type not a object wrapper
    public void addTransaction(double amount){
        this.transactions.add(amount);  // from primitive to a object wrapper autoboxing.
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }


}
