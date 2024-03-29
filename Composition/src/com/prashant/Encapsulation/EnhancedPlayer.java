package com.prashant;
//Class with the proper Encapsulation
public class EnhancedPlayer {
    private String name;
  //  private int health = 100;
    private int health = 100;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        //validating the health in constructor
        if (health >0 && health <= 100 ) {
            this.health = health;
        }
        this.weapon = weapon;
    }

    public void loseHealth(int damage){
        this.health = this.health - damage;
        if (this.health <= 0){
            System.out.println("Player Knocked out");
            //Reduce number of lives remaining for the player.
        }
    }

    public int getHealth() {
        return health;
    }
}
