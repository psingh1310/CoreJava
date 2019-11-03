package com.prashant;

public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmailAddress;
    private String customerPhoneNumber;

    //defaultConstructor or no-arg constructor
    public Account(){
        //Constructor initialize the object that we are creating
        this("56789",2.50,"Deault name", "Default Address",
                "default phone");
        //this this is a special,it is calling another constructor from one constructor
        //make sure that this is the (this) first line in the code to be executed
        System.out.println("Empty constructor is called");
    }

    //Constructors can ve overloaded, we can have more than one Constructor
    //we can call one constructor from the other constructor
    //for calling the constructor we initialize the new
    //parameterized Constructor

    public Account(String number,double balance, String customerName,
                   String customerEmailAddress, String customerPhoneNumber){
        System.out.println("Account Constructor with parameters is called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmailAddress = customerEmailAddress;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmailAddress, String customerPhoneNumber){
      this("9999",100.55,customerName,customerEmailAddress,customerPhoneNumber);
    }


    //method deposit
    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " +depositAmount+ " made. New balane is " +this.balance);
    }

    //method withdrawal
    public void withdrawal(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("Only " +this.balance+ " available.withdrawal not processed");
        } else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " +withdrawalAmount+ " processed. Remaining amount = " +this.balance);
        }
    }

    public void setNumber(String number){
        this.number = number;
    }
    public String getNumber(){
        return number;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return  balance;
    }

    public void setCustomerName(String customerName){
        this.customerName = customerName;
    }
    public String getCustomerName(){
        return customerName;
    }

    public void setCustomerEmailAddress(String customerEmailAddress){
        this.customerEmailAddress = customerEmailAddress;
    }
    public String getCustomerEmailAddress(){
        return customerEmailAddress;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber){
        this.customerPhoneNumber = customerPhoneNumber;
    }
    public String getCustomerPhoneNumber(){
        return this.customerPhoneNumber;
    }
}
