package com.prashant;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("State Bank of India");

         bank.addBranch("Patna");

         bank.addCustomer("Patna","Prashant",10000.00);
         bank.addCustomer("patna","Viresh",20000.00);
         bank.addCustomer("patna","Aanand",400000.00);

         bank.addBranch("Delhi");
         bank.addCustomer("Delhi","Anirudha",500000.00);

         bank.addTransactionAmount("patna","prashant",50);
         bank.addTransactionAmount("patna","viresh",500);
         bank.addTransactionAmount("patna","Anand",600);

         bank.listCustomers("patna",true);
    }
}
