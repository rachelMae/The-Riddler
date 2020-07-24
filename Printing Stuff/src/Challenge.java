import java.util.Scanner;

public class Challenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int var = scan.nextInt();
		int i = 0;
		int r = 1;
		
		while ( i< var){
			i+=r;
			r+=i;
			
			}
		if(i > var|| r>var){
			if(var<i){
				System.out.println(i);
	
			}
			else if(var>i){
			System.out.println(r);
			}
			else if(var==i){
				System.out.println(i);
			}
			else if(var==r){
				System.out.println(r);
			}
	}}

}
