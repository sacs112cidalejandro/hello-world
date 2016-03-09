import java.util.Scanner; 
import java.util.Random; 


public class RockPaperScissors 
{ 
public static void main(String[]args) 

{   //Input
    String personPlay; //
    String computerPlay = ""; 
    int computerInt;
    String response; 

    boolean status=true;
    while (status)
    {
    Scanner scan = new Scanner(System.in); 
    Random generator = new Random(); 

    System.out.println("Want to play Rock, Paper, Scissors?\n\n" + 
                       "Enter your move.\n" + "Rock = R, Paper" + 
                       "= P, and Scissors = S.");

    System.out.println();

  
    computerInt = generator.nextInt(3)+1; 


    //Conditional Statement 
    if (computerInt == 1) 
       computerPlay = "R"; 
    else if (computerInt == 2) 
       computerPlay = "P"; 
    else if (computerInt == 3) 
       computerPlay = "S"; 


     
    System.out.print("Enter your move:"); 
    personPlay = scan.next();

     
    personPlay = personPlay.toUpperCase(); 

    //Output
    System.out.println("Computer play is: " + computerPlay); 


    //Conditional Statement
    if (personPlay.equals(computerPlay)) 
       System.out.println("\nTie!"); 
    else if (personPlay.equals("R")) 
       if (computerPlay.equals("S")) 
          System.out.println("\nYou Win!");
    else if (computerPlay.equals("P")) 
            System.out.println("\nYou Lose!"); 
    else if (personPlay.equals("P")) 
       if (computerPlay.equals("S")) 
       System.out.println("\nYou Lose!!"); 
    else if (computerPlay.equals("R")) 
            System.out.println("\nYou Win!!"); 
    else if (personPlay.equals("S")) 
         if (computerPlay.equals("P")) 
         System.out.println("\nYou Win!!"); 
    else if (computerPlay.equals("\nR")) 
            System.out.println("\nYou Lose!!"); 
    else 
         System.out.println("Invalid user input."); 
    System.out.print("\nFor a new move press y or press j to shutdown:\n");
    Scanner sc = new Scanner(System.in);
    String input=sc.nextLine();
    if (input.equalsIgnoreCase("J")) {
        System.exit(0);
    } else if (input.equalsIgnoreCase("Y\n")) {
        status = true;
    
    

    }
   }
}
}