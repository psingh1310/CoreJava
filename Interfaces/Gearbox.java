package com.prashant;

public class Gearbox {
    private boolean clutchIsIn;
    //if this method is changed the methods overriding it are going to be disturbed.

    public void operateClutch(boolean inOrOut){
        this.clutchIsIn = inOrOut;
    }
}
