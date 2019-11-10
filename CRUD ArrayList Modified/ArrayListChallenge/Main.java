package com.prashant;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("8390-1087-05");
    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();

        while (!quit){

            System.out.println("\n Enter Actions: (6 to show available Actions)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("\nClosing the Phone......");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }
    }



//Add new Contact
private static void addNewContact(){
    System.out.println("Enter the new Contact name: ");
    String name= scanner.nextLine();
    System.out.println("Enter your phone number: ");
    String phoneNumber =  scanner.nextLine();
    Contact newContact = Contact.createContact(name,phoneNumber);  //static method in the Contact class

    if(mobilePhone.addNewContact(newContact)){
        System.out.println("New contact added:" + name + " ,Phone = " +phoneNumber);
    } else
        System.out.println("Cannot add: " +name+ " alredy in file");
}

//update contact

    private static void updateContact(){
        System.out.println("Enter the existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);  //static method
        if (existingContactRecord == null)
        {
            System.out.println("Could not found the record");
            return;
        }

        System.out.println("Enter the new name:");
        String newName = scanner.nextLine();
        System.out.println("Enter the new phone number: ");
        String newPhoneNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName,newPhoneNumber);  //static method
        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Successfully updated the Record");
        } else
        {
            System.out.println("Error in updating the record");
        }
    }


    //Remove Contact

    private static void removeContact() {
        System.out.println("Enter the existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);  //static method
        if (existingContactRecord == null) {
            System.out.println("Could not found the record");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)){
            System.out.println("Successfully delated the record");
        } else {
            System.out.println("Error delating Contact");
        }
    }


    //Query

    private static void queryContact() {
        System.out.println("Enter the existing name: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);  //static method
        if (existingContactRecord == null) {
            System.out.println("Could not found the record");
            return;
        }

        System.out.println("Name: " + existingContactRecord.getName() +
                "phone Number is: " + existingContactRecord.getPhoneNumber());
    }


    public static void startPhone(){
        System.out.println("Starting the phone......");
    }

    public static void printActions(){
        System.out.println("\nAvailable actions: \nPress");
        System.out.println(" 0 - To SwitchOff\n"+
                         "1 - To Print Contacts\n"+
                 "2 - To add new contacts\n" +
                 "3 - To update an existing Contact\n" +
                 "4 - To Remove an existing Contact\n" +
                 "5 - Query if an existing contact exists\n" +
                 "6 - To print a List of available actions.");

        System.out.println("Choose Your Action: ");
    }


}
