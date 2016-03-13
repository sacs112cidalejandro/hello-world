//Chapter5Homework
//Implement calculator using Conditional Statement
//Input
//Processing
//Conditional Statement
//Output

import java.util.Scanner;

public class Chapter_5Homework {
	
public static void main(String[]args) {
	 boolean status=true;
	    while (status){
	    Scanner scanner = new Scanner(System.in);
	    Scanner scanner1 = new Scanner(System.in);
	    System.out.print("Enter your first number:");
	    int num1 = scanner.nextInt();
	    System.out.print("\nEnter your second number:");
	    int num2 = scanner.nextInt();
	    System.out.print("\nEnter the fuction (+,-,*,/)here:");
	    int ans =0;
	    String option = scanner1.nextLine();
	    if(option.equalsIgnoreCase("+")) {
	        ans = num1 + num2;
	    }
	    else if(option.equalsIgnoreCase("-")) {
	        ans = num1 - num2;
	    }
	    else if(option.equalsIgnoreCase("*")) {
	        ans = num1 * num2;
	    }
	    else if(option.equalsIgnoreCase("/")) {
	        ans = num1 / num2;
	    }
	    else if(option.equalsIgnoreCase("%")) {
	        ans = num1 % num2;
	    }
	    System.out.printf("\nYour answer is:%d\n",  ans);
	     System.out.print("\nPress y to try a new calculation or press j for shutdown:\n");
	   
	   Scanner sc = new Scanner(System.in);
	        String input=sc.nextLine();
	        if (input.equalsIgnoreCase("j")) {
	            System.exit(0);
	        } else if (input.equalsIgnoreCase("Y")) {
	            status = true; 
	        }
	    }
	}
}