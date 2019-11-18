package com.prashant;

public interface ITelephone {
    //methods that are implemented by the class that is going to use this interface.
    //Signatures
    //access modifier are redundant here ,their is no need
    // as they are going to implemented in other classes
    void powerOn();
    void dial(int phoneNumber);
    void answer();
    boolean callPhone(String number);
    boolean isRinging();

    /*These methods most be implemented with appropriate parameter and return type in
    * the derive class*/
}
