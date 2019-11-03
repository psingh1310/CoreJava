package com.prashant;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String emailAddress;

    public VipCustomer() {
        this("Default name", 50000.0,"default@gmail.com");
    }

    public VipCustomer(String name, double creditLimit) {
//        this.name = name;
//        this.creditLimit = creditLimit;
        this(name,creditLimit,"unknown@gmail.com");
    }
//here first two constructors are calling the third constructor
    //and 3rd constructor is the only constructor that does save the values.
    public VipCustomer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName(){
        return name;
    }
    public double getCreditLimit(){
        return creditLimit;
    }
    public String getEmailAddress(){
        return emailAddress;
    }
}
