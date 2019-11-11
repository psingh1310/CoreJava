package com.prashant;

import java.util.ArrayList;

public class Branch {
    //branchName
    private String name;
    //List of separate customers in the branch
    private ArrayList<Customer> customers;

    //Constructors
    public Branch(String name) {
        this.name = name;
        this.customers = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }
//getter
    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    //adding newCustomer on file
    public boolean newCustomer(String customerName, double initialAmount){
        if(findCustomer(customerName) == null){
            //add
            this.customers.add(new Customer(customerName,initialAmount));  //new Customer -> Customer object
            return true; //Customer is added successfully
        }
        return false;   //customer already exists
    }

//adding the new transaction
    public boolean addCustomerTransaction(String customerName, double amount){
        Customer existingCustomer = findCustomer(customerName);
        if (existingCustomer != null){
            existingCustomer.addTransaction(amount);  //amount is added
            //it executing addTransaction method into the Customer class
            return true;
        }
        return false;
    }

    //private because this customer is used only privately in the class
    //FindCustomer
    private Customer findCustomer(String customerName){
        for(int i = 0; i < customers.size(); i++){
            Customer checkCustomer = this.customers.get(i);
            if(checkCustomer.getName().equals(customerName)){
                return checkCustomer;
            }
        }
        return null;
    }
}
