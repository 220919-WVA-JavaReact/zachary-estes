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

    // Now that we have a pokemon we might want to find some way to construct our pokemon object

    public Pokemon (String name){
        this.name = name;

        Random random = new Random();

        this.level = random.nextInt(100) + 1;

        this.health = random.nextInt(100) + 1;

        this.attack = random.nextInt(100) + 1;
    }

    /*
    We now have a way to create a pokemon object but what about attacking and stuff

    we need yo create a method so these pokemon can battle

    we can also creat an attempt catch method
     */

    //Lets start our method fopr battling pokemon

    public Pokemon battle(Pokemon opponent){
        //How do we battle?

        //When my pokemon attacks another pokemon, my attack should reduce their health and their attacl should
        // reduce my pokemon's health

        opponent.health -= this.attack;

        this.health -= opponent.attack;

        return opponent;
    }
}
