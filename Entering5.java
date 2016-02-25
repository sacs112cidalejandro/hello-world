import java.util.Scanner;

//Fig. 2.7: Entering.java
//Entering program that ask user to enter 2 numbers

public class Entering5 
{
	//main method begins execution of Java application
	public static void main(String[] args)
	{
		//create a Scanner to obtain input from the command window 
		Scanner input = new Scanner(System.in);
		
		int number1; // 5
		int number2; //50
		int sum; //sum of number1 and number2
		int difference; //difference of number2 and number1
		int product; //product of number1 and number2
		int quotient; //quotient of number2 and number1
		
		System.out.print("Enter a number"); // prompt
		number1 = input.nextInt(); //
		
		System.out.print("Now Enter"); //prompt
		number2 = input.nextInt(); //
		
		sum = number1 + number2; // add numbers, then store total in sum
		difference = number2 - number1; // subtract numbers, then store total in difference 
		product = number1 * number2; //product numbers, then store totals in product
		quotient = number2 / number1; //quotient numbers, then store totals in quotient
		
		System.out.printf("Sum is %d\n", sum); //display sum 
		System.out.printf("difference is %d\n", difference); //display difference
		System.out.printf("product is %d\n", product); //display product
		System.out.printf("quotient is %d\n", quotient); //display quotient
		
		System.out.print("Enter a number"); // prompt
		number1 = input.nextInt(); //
		
		System.out.print("Now Enter"); //prompt
		number2 = input.nextInt(); //
		
		sum = number1 + number2; // add numbers, then store total in sum
		difference = number2 - number1; // subtract numbers, then store total in difference 
		product = number1 * number2; //product numbers, then store totals in product
		quotient = number2 / number1; //quotient numbers, then store totals in quotient
		
		System.out.printf("Sum is %d\n", sum); //display sum 
		System.out.printf("difference is %d\n", difference); //display difference
		System.out.printf("product is %d\n", product); //display product
		System.out.printf("quotient is %d\n", quotient); //display quotient
		
		
	}//end method main
}//end class entering
