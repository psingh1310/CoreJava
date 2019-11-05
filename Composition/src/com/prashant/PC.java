package com.prashant;
//Here we creating the fields of the class(Case,Monitor,Motherboard)
//This is has a relationship
//This is advantage over extends as we can extend only one class at a time
//Here PC comprises of the other three classes

public class PC {
    private Case theCase; //PC has got Case
    private Monitor monitor; //PC has got a Monitor
    private Motherboard motherboard; //PC has a relationship with motherboard

    public PC(Case theCase, Monitor monitor, Motherboard motherboard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motherboard = motherboard;
    }

    public void powerUp(){
    // getTheCase().pressPowerButton();
     theCase.pressPowerButton();
     drawLogo();
    }

    private void drawLogo(){
        //graphics
      //  getMonitor().drawPixelAt(1200,1040,"Blue");
        //or we can access directly using the variable
        monitor.drawPixelAt(1200,1040,"Blue");
    }

    private Case getTheCase() {
        return theCase;
    }

    private Monitor getMonitor() {
        return monitor;
    }

    private Motherboard getMotherboard() {
        return motherboard;
    }
}
