package com.revature.pokemon;

import java.util.Random;
import java.util.Scanner;



public class PokemonGame {
    /*
    goal: we want to create some sort of console application that allows us to traverse around and catch?battle pokemon

    we should be able to maybe catch a pokemon, view our current pokemon and maybe view out party
     */
    /*
    public static void main(String[] args) {

        //testing pokemon creation
        Pokemon p1 = new Pokemon("Sandshrew");
        Pokemon p2 = new Pokemon("Shinx");
        Pokemon p3 = new Pokemon("Staryu");
        Pokemon p4 = new Pokemon("Sableye");

        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health);
        System.out.println(p3.name + " " + p3.attack + " " + p3.level + " " + p3.health);
        System.out.println(p4.name + " " + p4.attack + " " + p4.level + " " + p4.health);

        // testing pokemon battling
        p1.battle(p2);

        System.out.println("------------------------------------------------------------------");
        System.out.println(p1.name + " " + p1.attack + " " + p1.level + " " + p1.health + " " + p1.fainted);
        System.out.println(p2.name + " " + p2.attack + " " + p2.level + " " + p2.health + " " + p1.fainted);
    }
    */
    public static void main(String[] args) {


    boolean running = true;

    Scanner input = new Scanner(System.in);

    // Lets create a party of our pokemon

    Pokemon[] party = new Pokemon[6];
    Pokemon p1 = new Pokemon("Sandshrew");
    party[0] = p1;
    int partySize = 0;

    String[] possibleEncounters = { "Shinx", "Sableye", "Staryu", "Lugia", "Pikachu", "Umbreon", "Sylveon", "Bayleaf"};

    Random random = new Random();


    // this loop powers our main app

        while (running) {
            //all of our app stuff should go in here

            Pokemon p2 = new Pokemon(possibleEncounters[random.nextInt(possibleEncounters.length)]);

            System.out.println("You've encountered a wild " + p2.name);

            // give opts to player

            System.out.println("Type 'run' to run, type 'battle' to battle, 'Party' to view your party");
            //store response to variable
            // now we need to check user input

            String choice = input.nextLine();

            //System.out.println(choice);

            //lets do some logic based off input

            if ( choice.equals("run")){
                System.out.println("You ran from the battle");
            }else if (choice.equals("battle")){
                //if we choose battle we should get a suboption to catch or attack
                String subchoice = input.nextLine();
                System.out.println("Type attack to attack or catch to catch");
                if(subchoice.equals("attack")){
                    p1.battle(p2);
                    System.out.printf(
                            "Your pokemon: " + p1.name + "\n"
                                    + "Health " + p1.health + "\n"
                                    + "Fainted " + p1.fainted
                    );
                    System.out.println(
                            "Opponent Pokemon: " + p2.name +"\n"
                                    + "Health: " + p2.health  + "\n"
                                    + "Fainted " + p2.fainted
                    );
                }
                if(subchoice.equals("catch")){
                    //this is where we add the pokemon to party
                    //check if we have 6 pokemon, if not we can add to our party
                    if( partySize < 6){
                        party[partySize] = p2;
                        partySize += 1;
                    }else {
                        System.out.println("You already have 6 pokemon");
                        break;
                    }
                }
            }else if (choice.equals("Party")){
                System.out.println("Party");
                for(int i = 0; i < party.length; i++){
                    if(party[i] != null){
                        System.out.println(party[i].name);
                    }else{
                        continue;
                    }
                }
            }else{
                System.out.println("Invalid input");
            }
            break;
        }
    }
}
