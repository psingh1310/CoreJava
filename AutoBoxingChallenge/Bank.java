package com.prashant;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    //constructor
    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }

    //add branch
    public boolean addBranch(String branchName) {
        if (findBranch(branchName) == null) {
            this.branches.add(new Branch(branchName)); //new branch get added (calling branch constructor)
            return true;
        }
        return false;
    }

    //add Customer
    public boolean addCustomer(String branchName, String customerName, double initialAmount) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.newCustomer(customerName, initialAmount); //true
        }
        return false; //if branch not found
    }

    //add Customer Transaction
    public boolean addTransactionAmount(String branchName, String customerName, double amount) {
        //search if thr branch exist or not
        Branch branch = findBranch(branchName);
        if (branch != null) {
            return branch.addCustomerTransaction(customerName, amount); // returning true
        }
        return false;  //branch == null
    }

    //findBranch
    private Branch findBranch(String brachName) {
        for (int i = 0; i < branches.size(); i++) {
            Branch checkBranch = this.branches.get(i);  //position of branch name
            if (checkBranch.getName().equals(brachName)) {
                return checkBranch;
            }
        }
        return null;   //not found the match
    }

    //show a list of customer for a particular branch and optionally a list of their transactions
    public boolean listCustomers(String branchName, boolean showTransaction) {
        Branch branch = findBranch(branchName);
        if (branch != null) {
            System.out.println(" Customers details for branch " + branch.getName());  //displaying customer details for branch

            //List of Customers
            //to find that the part of branch the customer is retrieved
            ArrayList<Customer> branchCustomers = branch.getCustomers();  //we retrieved the customer that we are lookin for

            //all the customers for the particular branch
            for (int i = 0; i < branchCustomers.size(); i++) {
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]");
                //if is only get executed if showTransactions is true
                if (showTransaction) {
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();  //to get trans.
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + " Amount " + transactions.get(j));
                    }
                }
            }

            return true;

        } else {
            return false;
        }
    }

}
