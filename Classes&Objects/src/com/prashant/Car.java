package com.prashant;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    public void setModel(String model){
       // this.model = model;
        //this.model is referring to the field in class car
        //while model is referring to the parameter in the method setModel

        String validModel = model.toLowerCase();
        if (validModel.equals("HondaCivic") || validModel.equals("tatahexa")){
            this.model = model;
        } else {
            this.model = "unknown";
        }
    }

   //ability to print(return) something out
   public String getModel(){
        return this.model; //here model field is returned
                           //which is updated by parameter model
   }
}
