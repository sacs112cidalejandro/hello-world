//Chapter 5 Lab 1
import java.util.Scanner;


public class Chapter5Lab1 {
	
	public static void main (String[] args){
		
		System.out.println("You're Hungry");
		System.out.println("Get in Line");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Are you thirsty? Yes or No?");
		String y = input.next();
		
		if (y.equalsIgnoreCase("yes"))
			System.out.println("Buy yourself a Coke" );	
		
		if (y.equalsIgnoreCase("yes"))
			System.out.println("Eat you lunch");
			
		if (y.equalsIgnoreCase("yes"))
			System.out.println("Return Tray");
		
		if (y.equalsIgnoreCase("yes"))
			System.out.println("leave");
			
		if (y.equalsIgnoreCase("no"))
				System.out.println("Eat you lunch");
				
		if (y.equalsIgnoreCase("no"))
				System.out.println("Return Tray");
		
		if (y.equalsIgnoreCase("no"))
				System.out.println("leave");
		}
	}






	

			
		
		
		
		
	

		
		
		
	



