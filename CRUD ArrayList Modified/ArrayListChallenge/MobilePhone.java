package com.prashant;

import java.util.ArrayList;

public class MobilePhone {
private String myNumber;
private ArrayList<Contact> myContacts;  //ArrayList of contact(Object)

//constructor
    public MobilePhone(String myNumber){
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>(); //initialized the array list(empty list)
    }

    //adding new contact in the file
    public boolean addNewContact(Contact contact){
        if(findContact(contact.getName()) >= 0){
            System.out.println("Contact is already in the file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    //update new contact
    public boolean updateContact(Contact oldContact, Contact newContact){
        int foundPosition = findContact(oldContact);
         if (foundPosition < 0){
             System.out.println(oldContact.getName() + ", was not found");
             return false;
         } else if (findContact(newContact.getName()) != -1 ){
             System.out.println("Contact with name" + newContact.getName() + " alredy exists" +
                     " update was not successful.");
             return false;
         }

         this.myContacts.set(foundPosition, newContact);
        System.out.println(oldContact.getName() + " is replaced with the " + newContact.getName());
        return true;
    }

    //Remove contact
    public boolean removeContact(Contact contact){
        int foundPosition = findContact(contact);
        if(foundPosition < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(foundPosition);
        System.out.println(contact.getName() + " was delated");
        return true;
    }

    //finding the contact and returning the contact position in the form of integer
    private int findContact(Contact contact){
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName){
        for (int i = 0; i < this.myContacts.size(); i++){
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)){
                return i; //position
            }
        }

        return -1; //if contact name not found
    }

    public String queryContact(Contact contact){
        if(findContact(contact) >= 0){
            return contact.getName();
        }
        return null;
    }


    //Query
    public Contact queryContact(String name){
        int position = findContact(name);
        if(position >= 0){
            return this.myContacts.get(position);
        }
        return null;
    }

//Printing the Contact name And The Number
    public void printContacts(){
        System.out.println("Contact List");
        for (int i = 0; i < this.myContacts.size(); i++){
            System.out.println( (i+1) + " . " +
                    this.myContacts.get(i).getName()+ " -> " +
                    this.myContacts.get(i).getPhoneNumber());
        }
    }

}
