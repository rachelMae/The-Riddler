import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random generator = new Random();
		Scanner scan = new Scanner(System.in);
		int numero;
		numero = generator.nextInt(101);
		System.out.println("Guess the number 1-100");
		int guess;
		int attempts = 1;
		guess = scan.nextInt();
		while(attempts < 5){
			if(guess == numero){
				System.out.println("Correct thats the number!");
				System.out.println("YOU WIN!!!!!!");
			}
			else if(guess < numero){
				System.out.println("Higher");
				attempts += 1;
			}
			else if(guess > numero){
				System.out.println("Lower");
				attempts += 1;
			}
			else{
				System.out.println("WHAT, thats not a number");
			}
			guess = scan.nextInt();
	}
		//System.out.println(attempts);
		if(attempts >=5){
			System.out.println("You have exceeded your 5 tries limit. You lose!");
		}
}}
