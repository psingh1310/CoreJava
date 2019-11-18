package com.prashant;

public class DeskPhone implements ITelephone {
    private String myNumber;
    private boolean isRinging;

    public DeskPhone(String myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        System.out.println("No action has been taken as desk phone does not have a power button");
    }

    @Override
    public void dial(int phoneNumber) {
        System.out.println("Now ringing " + phoneNumber + " on deskphone");
    }

    @Override
    public void answer() {
        if (isRinging){
            System.out.println("Peek the phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(String number) {
        if (number == myNumber){
            isRinging = true;
            System.out.println("Ringing.........");
        } else {
            return false;
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
