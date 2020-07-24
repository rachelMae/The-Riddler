import java.util.Random;
import java.util.Scanner;

public class HelloWorld {

	private static final char[] x = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Type a Name");
		System.out.println("Type a Sport ");
		System.out.println("Type a Color ");
		Scanner scan = new Scanner(System.in);

		String name = scan.nextLine();
		String sport = scan.nextLine();
		String color = scan.nextLine();
		String enter = scan.nextLine();
		int number = 3;


		//Story Text
		System.out.println("Hello World");	
		System.out.println("There once was a girl named Zoey, who lived in dorm 101.");
		System.out.println("West Philedelphia born and raised, in a playground, where she spent most of her days.");
		System.out.println("Chillin' out maxin, relaxin all cool, and all shouting some " + sport + " outside the school.");
		System.out.println("and then she found " + number + " " + color + " dogs, she named the biggest dog " + name + " the III.");
		System.out.println("Then the purple dog began to attack the " + sport + ".");
		System.out.println("Zoey died.");
		System.out.println("The moral of the story is don't play " + sport + "!");
		System.out.println("The End");
		System.out.println("   ");
		//riddle text
		System.out.println("   ");
		System.out.println("Alive without breath");
		System.out.println("As cold as Death");
		System.out.println("In the water never drinking");
		System.out.println("All in mail never clinking");
		System.out.println("WHAT AM I???");
		System.out.println("Guess a animal? Type it");
		String animal = scan.nextLine();


		System.out.println("....." + animal + ".....???");

		if(animal.equals("fish")){
			System.out.println("Correct, Amazing!");
		}
		else{
			System.out.println("................Are you Sure????");

		}
		//POKEMON
		System.out.println("What is the best pokemon gen? Answer First, secound, third...etc");
		String pokm = scan.nextLine();
		if (pokm.equals("first")){
			System.out.println("Orginal");
		}
		else if (pokm.equals("secound")){
			System.out.println("As long as you didn't choose chikorita");

		}
		else if (pokm.equals("third")){
			System.out.println("have you played the new remakes");
		}

		else if (pokm.equals("forth")){
			System.out.println("#Sinnohremakes");
		}
		else if (pokm.equals("fith")){
			System.out.println("Agreed....well other than trubbish");
		}
		else if (pokm.equals("sixth")){
			System.out.println("Kalos....");
	
		}
		else{
			System.out.println("HMMMMMMM I'm confused");
		}
		//Counting SHEEP
		System.out.println("Let's count some sheep! How many do you see");
		String guess = scan.nextLine();

		Random generator = new Random();
		int sheep;
		sheep=generator.nextInt(6);
		
		System.out.println("Too Bad, You found " + sheep + " sheep!!");
		if(sheep == 5) {
			System.out.println("yesyeysyeysyyey");
		}
		if(sheep == 2){
			System.out.println("nonononoonono");
		}
		if(sheep == 3){
			System.out.println("maybe");
		}
		
		}}


