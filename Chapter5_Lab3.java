//Chapter 5 Lab 
import java.util.Scanner;


public class Chapter5_Lab3 {
	
	public static void main (String[] args){
		
		System.out.println("You're Hungry");
		System.out.println("Get in Line");
		System.out.println("Buy Lunch");
		
		Scanner input = new Scanner(System.in);
		System.out.println("Are you thirsty? Yes or No?");
		String y = input.next();
			
		if (y.equalsIgnoreCase("yes"))
		{
			System.out.println("Did you eat breakfast?Yes or No:" );
		String option = input.next();
		
		if(option.equalsIgnoreCase("yes"))
			System.out.println("Buy diet coke");
		
		if(option.equalsIgnoreCase("No"))
			System.out.println("Buy coke");
		}
		if(y.equalsIgnoreCase("no"))
			System.out.println("Get water");
		    System.out.println("Eat your lunch");
		    System.out.println("Return Tray");
		    System.out.println("Leave");
		
		}
	}
