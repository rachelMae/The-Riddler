import java.util.Scanner;

// Expand this code box and copy

 
public class TheGuard {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose a Pokemon:\n1 - Bulbasaur\n2 - Charmander\n3 - Squirtle");
        int playerClass = userInput.nextInt();
        System.out.println("Your Rival wants to battle, what do you do?\n1 - Fight him\n2 - FIREBALL\n3 - Splash\n4 - Talk the trainer into fighting later\n5 - Intimidate the trainer\n6 - Bond with the trainer over your shared love of pokemon");
        int playerChoice = userInput.nextInt();
         
       if(playerClass == 1 && playerChoice == 1){
    	   System.out.println("Your Rivals's Charmander destroyed Bulbasaur");
       }
       else if(playerClass == 2 && playerChoice == 2){
    	   System.out.println("Charmanders pathetic fireball burned out before it reached your rival's face");
     
       }
       else if(playerClass == 3 && playerChoice == 3){
    	   System.out.println("Learn from magicarp, Splash has no affect");
       }
       else if(playerClass == 1 || playerClass == 2 && playerChoice == 4){
    	   System.out.println("Your rival reluctantly agreed to fight later");
       }
       else if(!(playerClass == 2 && playerChoice == 2)){
    	   System.out.println("Hmm that didn't work");
       }
       System.out.println("Are you ready?:\n1 - yes\n2 - no\n3 - maybe");
       int playerGuess = userInput.nextInt();
       
       userInput.close();
    }
    
 
}

