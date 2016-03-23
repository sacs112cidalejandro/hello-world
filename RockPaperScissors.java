import java.util.*;

public class RockPaperScissors{
	
    public static void main(String[]args){
    	
    Scanner input = new Scanner(System.in);
    Random randomNumber = new Random();
    System.out.println("Want to play Rock, Paper, Scissors?");
    System.out.print("\nEnter 0 for Scissors, 1 for Rock , or 2 for Paper: ");
    int player = input.nextInt();
    int computer = randomNumber.nextInt(3);
    for (int round = 1; round < 4; round++) {
		computer = 0 + (int) ( Math.random() * 10 );


    if (player == computer){
        System.out.println("\nTie! Try Again!");
    }
    else if(player == 0 && computer == 1){
        System.out.println("\nComputer is Rock, You Lose!");
    }
    else if(player == 0 && computer == 2){
        System.out.println("\nComputer is Paper, You Win!");
    }
    else if(player == 1 && computer == 0){
            System.out.println("\nComputer is Scissor, You Win!");
    }
    else if(player == 1 && computer == 2){
                System.out.println("\nComputer is Paper, You Lose!");
    }
    else if(player == 2 && computer == 0){
                    System.out.println("\nComputer is Scissor, You Lose!");
    }
    else if(player == 2 && computer == 1){
                        System.out.println("\nComputer is Rock, You Win!");
    }

}
}
}