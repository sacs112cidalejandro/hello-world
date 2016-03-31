import javax.swing.JOptionPane;
import java.util.Scanner;

public class DiceGame {

    static int rollDice() {


        int die1 = (int) (6 * Math.random()) + 1;

        return die1;

    }


    public static void main(String[] args) {

         

        int die1; 

        int die2; 

        int playerPoints = 0;

        int cpuPoints = 0;

        int roundPoints = 0; 

        String answer;

        boolean passToCpu = false;

        boolean playerRolled = false;

        Scanner input = new Scanner(System.in);

         
        String message=
        		String.format("Lets play a Dice Game.");
        JOptionPane.showMessageDialog(null, message);

        System.out.println("");

        String rules =
    		String.format("-- These are the rules of the Game --");
        JOptionPane.showMessageDialog(null, rules);
    
        String rules2=
        		String.format("" + 
        						"\n1.) You must accumulate 50 points." + 
        						"\n2.) If you roll a 1, you loose all your points for your round and your turn."+
        						"\n3.) If you roll two 1's, you loose ALL your total points and your turn."+
    							"\n4.) You can voluntarily give up your turn."+
    							"\n5.) The computer plays by the same rules, but if it rolls 20 points in a round, it must give up."+
    							"\n6.) You must roll at least once in a round, you cannot just give up dice."+
    							"");
        JOptionPane.showMessageDialog(null, rules2);

         

        while(playerPoints <= 50 && cpuPoints <= 50)

        {

            while(!passToCpu) {

                 

            	System.out.println("Please roll the dice by pressing 'y' and hitting enter");
                System.out.println("or if you want to pass enter 'n' and hit enter.");

                 

                answer = input.next(); 

                 

                if (answer.equalsIgnoreCase("y")){

                     

                    die1 = rollDice(); 

                    die2 = rollDice();

                     

                    System.out.println("Dice 1: " + die1);

                    System.out.println("Dice 2: " + die2);

                     

                    if (die1 == 1 || die2 == 1) {

                       roundPoints = 0;

                       passToCpu = true;

                       System.out.println("The Player got a one and loses the points for this round.");

                       System.out.println("The round passes to the CPU.");    

                       System.out.println("Players points: " + playerPoints);
                    } else if (die1 == 1 && die2 == 1) {

                        roundPoints = 0;

                        playerPoints = 0;

                        passToCpu = true;

                        System.out.println("The Player got double one and loses ALL his points.");

                        System.out.println("The round passes to the CPU.");   

                        System.out.println("Players points: " + playerPoints);

                    } else {                   

                        roundPoints += die1 + die2;

                        System.out.println("Current Round Points: " + roundPoints);

                    }

                     

                } else if (answer.equalsIgnoreCase("n")){

                    playerPoints = playerPoints + roundPoints;

                    System.out.println("Players points: " + playerPoints);

                    passToCpu = true;

                    roundPoints = 0;

                } else {

                    System.out.println("Invalid entry, please try again.");

                     

                }

            }

                if (passToCpu) {               
                       

                        int numberOfCpuRolls = (int) (6 * Math.random()) + 1;

                         

                        System.out.println("number of cpu rolls: " + numberOfCpuRolls);

                         

                        int cpuTurns = 0; // 

                         
                    while(cpuTurns < numberOfCpuRolls && roundPoints <= 20) {


                        die1 = rollDice();

                        die2 = rollDice();

                         

                        System.out.println("Dice 1: " + die1);

                        System.out.println("Dice 2: " + die2);

                         

                        if (die1 == 1 || die2 == 1) {

                            roundPoints = 0;

                            passToCpu = false;

                            System.out.println("The CPU player got a one and loses the points for this round.");

                            System.out.println("The round passes to the Player.");

                             

                            break;

                        } else if (die1 == 1 && die2 == 1) {

                            roundPoints = 0;

                            cpuPoints = 0;

                            passToCpu = false;

                            System.out.println("The CPU player got double one and loses ALL his points.");

                            System.out.println("The round passes to the Player.");

                            break;

                        } else {

                            roundPoints += die1 + die2; 

                            System.out.println("Your Current round points: " + roundPoints);

                            cpuTurns++;

                        }

                    }

                    cpuPoints = cpuPoints + roundPoints;

                    System.out.println("CPU's Points: " + cpuPoints);

                    roundPoints = 0;

                    passToCpu = false; //
                  
                   
                } 

            } 

        System.out.println("End of loop and Game.");

    } 

 

} 

