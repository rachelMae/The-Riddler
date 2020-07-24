import java.util.Random;
import java.util.Scanner;

public class TheRiddler {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Character player1 = new Character();
	    Character player2 = new Character();
	    Scanner userInput = new Scanner(System.in);
	    System.out.println("What will you be called?");
  	  String nombre = userInput.nextLine();
	    player1.name = nombre;
	    player1.health = 100;
        player1.strength = 20;
	    player2.name = "The Riddler";
        player2.health = 100;
        player2.strength = 25;
        int [] choices = new int[11];
        System.out.println("It is I, The Riddler");
        System.out.println("Welcome to my Game!");
        System.out.println("Here is a brief rundown of my rules,");
        System.out.println("You must answer 5 riddles correctly to defeat me.");
        System.out.println("However if you answer more than four incorrectly...I win.");
        System.out.println("Hahaha, NO secound chances");
        Thread.sleep (3000);
        System.out.println(player1.name + " vs. " + player2.name);
        System.out.println(player1.health + " vs. " + player2.health);
        Thread.sleep (3000);
        while(player1.isAlive() && player2.isAlive()){
        	int damage;
            System.out.println(player1.name + ": " + player1.health);
            System.out.println(player2.name + ": " + player2.health);
            System.out.println("Choose a Number: 1-10");
            int playerRiddle = userInput.nextInt();
            while(playerRiddle>10 || playerRiddle<0 || isIn(choices,playerRiddle ) == true){
            	playerRiddle = userInput.nextInt();
            }
            choices[playerRiddle] = playerRiddle;
            	if(playerRiddle == 1){
            		System.out.println("   ");
            		System.out.println("Alive without breath,");
            		System.out.println("As cold as Death,");
            		System.out.println("Never thirsty, Ever drinking,");
            		System.out.println("All in mail, never clinking,");
            		System.out.println("WHAT AM I???");
            		System.out.println("Guess a animal? Type it");
            		userInput.nextLine();
            		String Fish = userInput.nextLine();
            				if(Fish.equals("fish")){
            					System.out.println("Correct, Amazing!");
            				  	 damage = player1.attack(player2);
            			            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
            				}
            				else{
            					System.out.println("HAHAHA....incorrect");
            			            damage = player2.attack(player1);
            			            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
            	}
            	}
            	else if(playerRiddle == 2){
            	  System.out.println("In marble walls as white as milk,");
            	  System.out.println("Lined with skin as soft as silk,");
            	  System.out.println("Within a fountain crystal clear,");
            	  System.out.println("A Golden apple does appear,");
            	  System.out.println("No doors are there to this stronghold");
            	  System.out.println("Yet thieves break in and steal the gold.");
            	  System.out.println("What am I?");
            	  userInput.nextLine();
            	  String egg = userInput.nextLine();
            	  	if(egg.equals("egg")){
  					System.out.println("Correct, Amazing!");
  				  	 damage = player1.attack(player2);
  		            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
  				}
            	  	else{
    					System.out.println("HAHAHA....incorrect");	
    			           damage = player2.attack(player1);
    			            System.out.println(player2.name + " hits " + player1.name + " for " + player2.strength);
    	}
              }
            	else if(playerRiddle == 3){
            	  System.out.println("Only one color, but not one size,");
            	  System.out.println("Stuck on the bottom, yet easily flies,");
            	  System.out.println("Present in sun, but not in rain,");
            	  System.out.println("Doing no harm, and feeling no pain.");
            	  System.out.println("What am I?");
            	  System.out.println("Type your answer");
            	  userInput.nextLine();
            	  String Shadow = userInput.nextLine();
          	  	if(Shadow.equals("shadow")){
  					System.out.println("Correct, Amazing!");
  					 damage = player1.attack(player2);
   		            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
  				}
            	  	else{
    					System.out.println("HAHAHA....incorrect");	
    					  damage = player2.attack(player1);
  			            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
    	}
              }
            	else if(playerRiddle == 4){
            		System.out.println("All things it devours,");
            		System.out.println("Birds, Beasts, Trees, Flowers,");
            		System.out.println("Gnaws iron, bites steel,");
            		System.out.println("Grinds hard stones to metal,");
            		System.out.println("Slays kings, ruins towns,");
            		System.out.println("And beats high moutains down.");
            		System.out.println("What is it?");
            		 userInput.nextLine();
               	  String time = userInput.nextLine();
             	  	if(time.equals("time")){
      					System.out.println("Correct, Amazing!");
     					 damage = player1.attack(player2);
      		            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
             	  	}
             	  	else{
             	  		System.out.println("HAHAHA....incorrect");	
					  damage = player2.attack(player1);
			            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
             	  	}
              }
            	else if(playerRiddle == 5){
              	 System.out.println("What is always comming,");
              	 System.out.println("But never arrives?");
              	 System.out.println("hehehe");
              	userInput.nextLine();
             	  String tom = userInput.nextLine();
	             	 if(tom.equals("tommorrow")){
	   					System.out.println("Correct, Amazing!");
	  					 damage = player1.attack(player2);
	   		            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
	          	  	}
	             	else{
	         	  		System.out.println("HAHAHA....incorrect");	
					  damage = player2.attack(player1);
			            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
	         	  	}
                }
            	else if(playerRiddle == 6){
              	  System.out.println("What is the begining of eternity,");
              	  System.out.println("The end of time and space,");
              	  System.out.println("The begining of every end,");
              	  System.out.println("And the end of every race?");
              	  System.out.println("Answer???");
              	userInput.nextLine();
             	  String eee = userInput.nextLine();
	             	 if(eee.equals("e")){
	   					System.out.println("Correct, Amazing!");
	  					 damage = player1.attack(player2);
	   		            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
	          	  	}
	             	else{
	         	  		System.out.println("HAHAHA....incorrect");	
					  damage = player2.attack(player1);
			            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
	         	  	}
                }
            	else if(playerRiddle == 7){
              	  System.out.println("Voicless it cries,");
              	System.out.println("Wingless it flutters,");
              	System.out.println("Toothless it bites,");
              	System.out.println("Mouthless it mutters,");
              	System.out.println("What is it?");
            	userInput.nextLine();
           	  String wind = userInput.nextLine();
	           	  		if(wind.equals("wind")){
						System.out.println("Correct, Amazing!");
						 damage = player1.attack(player2);
			            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
	     	  	}
	           	  		else{
	         	  		System.out.println("HAHAHA....incorrect");	
					    damage = player2.attack(player1);
			            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
         	  	}
                }
            	else if(playerRiddle == 8){
              	  System.out.println("I can be a member of a group");
              	  System.out.println("but i can never blend in");
              	  System.out.println("What am i?");
              	userInput.nextLine();
             	  String ind = userInput.nextLine();
             	 if(ind.equals("individual")){
						System.out.println("Correct, Amazing!");
						 damage = player1.attack(player2);
			            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
	     	  	}
             	else{
         	  		System.out.println("HAHAHA....incorrect");	
				    damage = player2.attack(player1);
		            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
     	  	}
                }
            	else if(playerRiddle == 9){
              	  System.out.println("What occurs once in every minute,");
              	  System.out.println("Twice in every moment,");
              	  System.out.println("And never in a thousand years?");
              	  System.out.println("Think about it...");
              	userInput.nextLine();
              	String NNN = userInput.nextLine();
              	if(NNN.equals("m")){
					System.out.println("Correct, Amazing!");
					 damage = player1.attack(player2);
		            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
     	  	}
              	else{
         	  		System.out.println("HAHAHA....incorrect");	
				    damage = player2.attack(player1);
		            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
     	  	}
                }
            	else if(playerRiddle == 10){
              	  System.out.println("George's father has three sons");
              	  System.out.println("Snap, Crackle, and _____?");
              	userInput.nextLine();
              	String george = userInput.nextLine();
              	if(george.equals("george")){
					System.out.println("Correct, Amazing!");
					 damage = player1.attack(player2);
		            System.out.println(player1.name + " hits " + player2.name + " for " + damage);
     	  	}
              	else{
         	  		System.out.println("HAHAHA....incorrect");	
				    damage = player2.attack(player1);
		            System.out.println(player2.name + " hits " + player1.name + " for " + damage);
     	  	}
            	}}
//end loop
        if( player1.isAlive()){
            System.out.println(player1.name + " wins!");
			Thread.sleep (500);
			System.out.println("..............");
			Thread.sleep (5000);
			System.out.println("..............");
			Thread.sleep (5000);
			System.out.println(".....ha.....ha.....ha");
			Thread.sleep (5000);
			System.out.println("HAHAHAHAHAHAHAHAHAHA");
			Thread.sleep (5000);
			System.out.println("You were fooled, outwitted, and bamboozled");
			Thread.sleep (500);
			System.out.println("Those riddles were just a warm up");
			Thread.sleep (500);
			System.out.println("Try this one");
			System.out.println(" ");
			System.out.println(" ");
			Random randy = new Random();
			int riddles;
			riddles = randy.nextInt(5);
				if(riddles == 0){
					System.out.println(" What has roots as nobody sees,");
	              	 System.out.println("Is taller than trees,");
	              	 System.out.println("Up, Up, Up it goes,");
	              	 System.out.println("And never grows,");
	              	 System.out.println("What is it?");
	              	//userInput.nextLine();
	             	  String mount = userInput.nextLine();
		             	 if(mount.equals("mountain")){
		             	ridd();
		             		String ground = userInput.nextLine();
			             	 if(ground.equals("ground")){
			             		 System.out.println("RATS! " + player1.name + " wins today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		 yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else if(ground.equals("earth")){
			             		System.out.println("RATS! " + player1.name + " wins today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else{
			             		fail();
			             	 }
		     	  	}
		              	else{
		         	  		fail();
		             	 }
			}
				else if(riddles == 1){
					System.out.println("What is greater than God,");
					System.out.println("More evil than the devil,");
					System.out.println("The poor posses it,");
					System.out.println("the rich desire it,");
					System.out.println("And if you consume it... you will die?");
					System.out.println("What is it?");
					//userInput.nextLine();
	             	  String noth = userInput.nextLine();
		             	 if(noth.equals("nothing")){
		             	ridd();
		             		String ground = userInput.nextLine();
			             	 if(ground.equals("ground")){
			             		 System.out.println("RATS! " + player1.name + " wins today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		 yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else if(ground.equals("earth")){
			             		System.out.println("RATS! " + player1.name + " wins today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		 yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else{
			             		fail();
			             	 }
		     	  	}
		              	else{
		         	  		fail();
		             	 }
				}
				else if(riddles == 2){
					System.out.println("He who creates it has no need for it,");
					System.out.println("He who buys it has no use for it,");
					System.out.println("He who uses it can neither see nor feel it,");
					System.out.println("What is it?");
					//userInput.nextLine();
	             	  String coffin = userInput.nextLine();
		             	 if(coffin.equals("coffin")){
		             	ridd();
		             		String ground = userInput.nextLine();
			             	 if(ground.equals("ground")){
			             		 System.out.println("RATS! " + player1.name + " wins today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		 yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else if(ground.equals("earth")){
			             		System.out.println("RATS! You win today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		 yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else{
			             		fail(); 
			             	 }
		     	  	}
		              	else{
		         	  		fail();
		             	 }
				}
				else if(riddles == 3){
					System.out.println("If you have me, you want to share me,");
					System.out.println("If you share me you haven't got me,");
					System.out.println("What am I");
					//userInput.nextLine();
	             	String secret = userInput.nextLine();
		             	 if(secret.equals("secret")){
		             		ridd();
		             		String ground = userInput.nextLine();
			             	 if(ground.equals("ground")){
			             		 System.out.println("RATS! " + player1.name + " wins today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		 yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else if(ground.equals("earth")){
			             		System.out.println("RATS! You win today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		 yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else{
			             		fail(); 
			             	 }
		     	  	}
		              	else{
		         	  		fail();
		             	 }
				}
				else if(riddles == 4){
					System.out.println("What gets broken without being held?");
					System.out.println("This riddle is short but sweet");
					//userInput.nextLine();
	             	  String promise = userInput.nextLine();
		             	 if(promise.equals("promise" )){
		             		ridd(); 
		             		String ground = userInput.nextLine();
			             	 if(ground.equals("ground")){
			             		 System.out.println("RATS! " + player1.name + " wins today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else if(ground.equals("earth")){
			             		System.out.println("RATS! " + player1.name + " wins today");
			             		 System.out.println("But you haven't seen the last of The Riddler");
			             		 System.out.println("Mark my words.................");
			         			Thread.sleep (3000);
			             		yip();
			             		String puff = userInput.nextLine();
			             		if(puff.equals("puff"));{
			             			System.out.println("Why did the chicken cross the road");
			             		}
			             	 }
			             	 else{
			             		fail();
			             	 }
		     	  	}
		              	else{
		         	  		fail();
		              	}
				}
        }
        else if (player2.isAlive()){
            System.out.println(player2.name + " wins!");
            System.out.println("Ha Ha Ha");
            fail();
            String cheat = userInput.nextLine();
            if(cheat.equals("NO")){
            	System.out.println("Huh, You want redeption");
            	System.out.println("You will need to solve this puzzle");
            	System.out.println("Good luck");
            	Thread.sleep(2000);
        		System.out.println("I feel your every move,");
         		System.out.println("I know your every thought,");
        		System.out.println("I'm there from your birth,");
        		System.out.println("And I'll see you when you rot,");
        		System.out.println("I am your shadow,");
        		System.out.println("You shall never be free,");
        		System.out.println("What am I?");
            		String ground = userInput.nextLine();
	             	 if(ground.equals("ground")){
	             		 System.out.println("RATS! " + player1.name + " wins today");
	             		 System.out.println("But you haven't seen the last of The Riddler");
	             		 System.out.println("Mark my words.................");
	         			Thread.sleep (3000);
	             		yip();
	             		String puff = userInput.nextLine();
	             		if(puff.equals("puff"));{
	             			System.out.println("Why did the chicken cross the road");
	             		}
	             	 }
	             	 else if(ground.equals("earth")){
	             		System.out.println("RATS! " + player1.name + " wins today");
	             		 System.out.println("But you haven't seen the last of The Riddler");
	             		 System.out.println("Mark my words.................");
	         			Thread.sleep (3000);
	             		yip();
	             		String puff = userInput.nextLine();
	             		if(puff.equals("puff"));{
	             			System.out.println("Why did the chicken cross the road");
	             		}
	             	 }
	             	 else{
	             		fail();
	             	 }
            }
        }
        else{
            System.out.println("It's a draw!");
	}}
	public static void fail(){
		System.out.println("HAHAHA....incorrect");	
	  	System.out.println("Someone isn't as smart as they thought they were");
		System.out.println("You perished at the hands of The Riddler");
        System.out.println("GAME OVER");
	}
	public static void yip(){
		 System.out.println("Congratulations!!!!");
		 System.out.println("You beat the Riddler");
		 System.out.println("GAME OVER");
	}
	public static void ridd(){
		System.out.println("Correct, Unbelievable");
		System.out.println("But I have still got a few tricks up my sleeve");
		System.out.println("");
		System.out.println("I feel your every move,");
 		System.out.println("I know your every thought,");
		System.out.println("I'm there from your birth,");
		System.out.println("And I'll see you when you ro,t");
		System.out.println("I am your shadow,");
		System.out.println("You shall never be free,");
		System.out.println("What am I?");
	}
	public static boolean isIn(int[] array, int check){
		int i=0;
		while(i < 11){
			if(array[i] == check){
				return true;
			}
			i++;
		}
		return false;
	}
	}