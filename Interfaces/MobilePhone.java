package com.prashant;

public class MobilePhone implements ITelephone {

    private String myNumber;
    private boolean isRinging;
    private boolean isOn = false;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Power is on");
    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on MobilePhone");
        } else {
            System.out.println("SwitchedOf");
        }
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Peek the Mobilephone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String number) {
        if (number == myNumber && isOn){
            isRinging = true;
            System.out.println("Ringing.........");
        } else {

            MyConsole.print("Phone might not be on ");
            return false;

        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }

}
