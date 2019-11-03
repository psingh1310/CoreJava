package com.prashant;

public class Main {

    public static void main(String[] args) {

//        Account kumarAccount = new Account("123456",0.00,"kumar",
//                "Psingh1310@gmail.com","8390108705");
        //checking the this with default constructor
        Account kumarAccount = new Account();
        //in this the both constructors is called

        System.out.println(kumarAccount.getNumber());
        System.out.println(kumarAccount.getBalance());

        //one of way to set
//        kumarAccount.setNumber("123456");
//        kumarAccount.setBalance(0.00);
//        kumarAccount.setCustomerName("Kumar");
//        kumarAccount.setCustomerEmailAddress("Psingh1310@gmail.com");
//        kumarAccount.setCustomerPhoneNumber("8390108705");

        kumarAccount.withdrawal(100.0);
        kumarAccount.deposit(50.0);
        kumarAccount.deposit(51.50);
        kumarAccount.withdrawal(100.0);

        Account singhAccount = new Account("Singh",
                "nsingh1013@gmail.com","12345");
        System.out.println(singhAccount.getNumber() + " name " + singhAccount.getCustomerName());

        VipCustomer person = new VipCustomer();
        System.out.println(person.getName());

        VipCustomer person2 = new VipCustomer("Rai",10000);
        System.out.println(person2.getName());

        VipCustomer person3 = new VipCustomer("Jha",200000,"jha@gmail.com");
        System.out.println(person3.getName());
    }
}
