import java.util.Scanner; 

public class Week6_Lab3
{

	public static void main ( String[] args)
	{
	Scanner in = new Scanner(System.in); 
	
	int computer;
	int user;
	
	System.out.println("Enter a Number:");
	user = in.nextInt();
	
	System.out.println("Computer Entered:");
	computer = 0 + (int) ( Math.random() * 10 );
	System.out.println(computer);
	
	if(user==computer)
		System.out.println("Your number is correct");
	else if(user>computer)
		System.out.println("Your number is bigger!");
	else 
		System.out.println("Your number is smaller");
	}
}
	