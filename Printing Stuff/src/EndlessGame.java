import java.util.Random;
import java.util.Scanner;
import java.lang.*;

public class EndlessGame {

	public static void main(String[] args) throws InterruptedException {
		 Scanner userInput = new Scanner(System.in);
	        System.out.println("Choose a Pokemon:\n1 - Bulbasaur\n2 - Charmander\n3 - Squirtle");
	        int playerClass = userInput.nextInt();
	        System.out.println("Your Rival wants to battle, what do you do?\n1 - Fight him\n2 - FIREBALL\n3 - Splash\n4 - Talk the trainer into fighting later\n5 - Intimidate the trainer\n6 - Bond with the trainer over your shared love of pokemon");
	        int playerChoice = userInput.nextInt();
	       if(playerClass == 1 && playerChoice == 1){
	    	   System.out.println("Get ready Bulbasaur");
	       }
	       else if(playerClass == 2 && playerChoice == 2){
	    	   System.out.println("Charmanders pathetic fireball burned out before it reached your rival's face");
	       }
	       else if(playerClass == 3 && playerChoice == 3){
	    	   System.out.println("Learn from magicarp, Splash has no affect");
	       }
	       else if(playerClass == 1 || playerClass == 2 || playerClass == 3 && playerChoice == 4){
	    	   System.out.println("You failed your rival sends out a pokemon");
	       }
	       else if(!(playerClass == 2 && playerChoice == 2)){
	    	   System.out.println("Hmm that didn't work");
	       }
	         userInput.close();
		Random generator = new Random();
		int playerhealth, enemyhealth;
		int playerdamage, enemydamage;
		int enemiesdefeated = 0;
		String [] pokemon = { "Zubat", "Golbat", "Patrat", "Jigglypuff"};
		pokemon[0]= "Zubat";
		pokemon[1]= "Golbat";
		pokemon[2]= "Patrat";
		pokemon[3]= "Jigglypuff";
		Character player1 = new Character();
	    Character player2 = new Character();
	    player1.name = "Trainer Ash";
	    player2.name = "Trainer Misty";
        System.out.println(player1.name + " vs. " + player2.name);
		int pokemonIndex = generator.nextInt(pokemon.length);
		String pokemo;
		pokemo = pokemon[pokemonIndex];
		playerhealth = 40;
		enemyhealth = generator.nextInt (10) + 1;
		while(playerhealth > 0) {
			if (enemyhealth <= 0) {
				System.out.println("The enemy pokemon fainted! Get ready for the next battle!");
				System.out.println("An enemy " + pokemo + " appeared");
				Thread.sleep (500);
				enemyhealth = generator.nextInt(10)+1;
				enemiesdefeated ++;
			}
			System.out.println(playerhealth + " vs. " + enemyhealth);
			System.out.println("Your pokemon has " + playerhealth + " health!");
			System.out.println("The enemy has " + enemyhealth + " health!");
			playerdamage = generator.nextInt(5)+1;
			enemydamage = generator.nextInt(3)+1;
			playerhealth -= enemydamage;
			enemyhealth -= playerdamage;
			System.out.println("The enemy attacked, You took " + enemydamage);
			System.out.println("You attacked, the enemy took " + playerdamage);
			pokemonIndex = generator.nextInt(pokemon.length);
			pokemo = pokemon[pokemonIndex];
		}
		System.out.println("You defeated " + enemiesdefeated + " enemy pokemon");
	}

}
