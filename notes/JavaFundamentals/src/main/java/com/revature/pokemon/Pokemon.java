package com.revature.pokemon;

import java.util.Random;

public class Pokemon {
    /*
    we need to think about which kind of information we want to store  about the pokemon

    things we may want are name, level, health, attack
     */

    String name;

    int level;

    int health;

    int attack;

    //we're adding on this field
    boolean fainted;

    // Now that we have a pokemon we might want to find some way to construct our pokemon object

    public Pokemon (String name){
        this.name = name;

        Random random = new Random();

        this.level = random.nextInt(100) + 1;

        this.health = random.nextInt(100) + 1;

        this.attack = random.nextInt(100) + 1;

        this.fainted = false;
    }

    /*
    We now have a way to create a pokemon object but what about attacking and stuff

    we need to create a method so these pokemon can battle

    we can also create an attempt catch method
     */

    //Lets start our method for battling pokemon

    public Pokemon battle(Pokemon opponent){
        //How do we battle?

        //When my pokemon attacks another pokemon, my attack should reduce their health and their attacl should
        // reduce my pokemon's health

       // opponent.health -= this.attack;

       // this.health -= opponent.attack;

       // return opponent;
        // if we attack opponent
        if (opponent.health - this.attack <= 0){
            opponent.health = 0;

            opponent.fainted = true;
        } else {
            opponent.health -= this.attack;
        }
        //if opponent attack us
        if (this.health - opponent.attack <= 0){
            this.health = 0;

            this.fainted = true;
        } else {
            this.health -= opponent.attack;
        }
        return opponent;
    }
}
