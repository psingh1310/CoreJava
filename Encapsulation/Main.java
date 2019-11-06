package com.prashant;

public class Main {

    public static void main(String[] args) {
     Player player = new Player(); //because we not set the parametrized constructor that's why
        //the default constructor without the argument is passed

     //that's why we need to manually set those fields
/*Note -> if we are setting the names manually then their is no guarantee
* that all the fields is set and this is a big problem
* that's why we need the constructors*/

       /*Also we need some validation in the player class and for that we
       * need methods ...... For example addHealth to make sure
       * that the health is not greater than some fixed value by the
       *  Administrator*/
       /*This Type Of Coding Is Not Recommended */

        player.name = "Singh";
     player.health = 20;
     player.weapon = "Sword";

     int damage = 10;
     player.loseHealth(damage);
     System.out.println("Remainig Health = "+ player.healthRemainig());

        damage = 11;
        //player.health = 200
        /*This is potential problem as we are directly accessing
        * the fields of the player class in Main class*/
        player.loseHealth(damage);
        System.out.println("Remainig Health = "+ player.healthRemainig());

        System.out.println("***************************");

        EnhancedPlayer enhancedPlayer = new EnhancedPlayer("Kuamr",
                500,"Sword");
        System.out.println(enhancedPlayer.getHealth());
    }
}
