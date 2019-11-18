package com.prashant;

public class Main {

    public static void main(String[] args) {
       //create instance of DeskPhone class
        ITelephone prashantPhone;
        //DeskPhone  kumarPhone;   //          this is valid
        prashantPhone = new DeskPhone("123456");
        prashantPhone.powerOn();
        prashantPhone.callPhone("123456");
        prashantPhone.answer();
        MyConsole.print("********************");

        ITelephone kumarPhone = new MobilePhone("8390108705");
        kumarPhone.callPhone("7903702917");
        kumarPhone.answer();
    }
}
