import java.util.Scanner;

public class Factorial{

	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter an integer numner: ");
		
		int input = scan.nextInt();
		int factorial=1;
		
		for(int i= input; i>=1;i--)
		 	factorial=factorial*i;
		 	
		 System.out.println("The factorial of "+ input+ " is "+ factorial+". ");
		
	}
}