package com.prashant;

public class Player {
    //This is the class without encapsulation to show why Encapsulation is important........
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player Knocked out");
            //Reduce number rof lives remaining for the player.
        }
    }

    public int healthRemainig(){
        return this.health;
    }
}
