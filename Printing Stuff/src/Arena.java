import java.util.Scanner;

public class Arena {
	

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
		Character player1 = new Character();
	    Character player2 = new Character();
	    player1.name = "Reshiram";
	    player1.health = 10;
        
        player1.strength = 9;   
	    player2.name = "Zekrom";
        player2.health = 10;
        
        player2.strength = 9;
        System.out.println(player1.name + " vs. " + player2.name);
        System.out.println(player1.health + " vs. " + player2.health);
        while(player1.isAlive() && player2.isAlive()){
        	int damage;
            System.out.println(player1.name + ": " + player1.health);
            System.out.println(player2.name + ": " + player2.health);
            damage = player1.attack(player2);
            damage = player2.attack(player1);
            player1.attack(player2);
            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
            player2.attack(player1);  
        }
        if( player1.isAlive()){
            System.out.println(player1.name + " wins!");
        }
        else if (player2.isAlive()){
            System.out.println(player2.name + " wins!");
        }
        else{
            System.out.println("It's a draw!");
        }
	}

}
