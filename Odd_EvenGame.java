import java.util.Scanner; 
import javax.swing.JOptionPane; 
 
 
public class Odd_EvenGame { 
 
public static void main(String[] args) { 
		 
	Scanner input = new Scanner (System.in); 
		 
	Odd_EvenGameObjects classObject = new Odd_EvenGameObjects("Player"); 
 		 
	int playAgain, roll, userInput, gameCount=1; 
	String userChoice = null; 
 	double win =0, evenWin=0, oddWin=0; 
 	double evenGuess=0, oddDice = 0; 
		 
	String name = JOptionPane.showInputDialog("Please enter your name: "); 
	 
classObject.setName(name); 		 
	String welcomeMessage = String.format("Hey %s! Lets Play Dice.\nCan you guess if the dice will be odd or even?.\n", classObject.getName()); 
	JOptionPane.showMessageDialog(null, welcomeMessage); 
 		 
 	do 
 	{ 
 	int diceNum = classObject.getDiceNum(); 
			 
	gameCount++; 
		classObject.setGameCount(gameCount); 
			 
	userInput = Integer.parseInt(JOptionPane.showInputDialog("\nPress 1 for odd or 2 for even: ")); 
 			 	 
	if (userInput ==1) userChoice="Odd"; 
 	if (userInput ==2) userChoice="Even"; 
			 
 	JOptionPane.showMessageDialog(null,"You chose "+ userChoice); 
 			 
	roll = Integer.parseInt(JOptionPane.showInputDialog("\n\nPress 1 to role the dice: ")); 
			 
	JOptionPane.showMessageDialog(null,"Dice number is "+ diceNum); 
			 
	if (userInput ==1) 
	{ 
	if (diceNum == 1 || diceNum==3 || diceNum ==5) 
	{ 
 	JOptionPane.showMessageDialog(null,"You won! The dice rolled an odd number."); 
	win++; oddWin++; oddDice++; 
	classObject.setWin(win); classObject.setOddWin(oddWin); classObject.setOddDice(oddDice); 
 	} 
	else 
		 JOptionPane.showMessageDialog(null,"You lose.\nThe dice rolled an even number."); 
 	} 
	else if (userInput ==2) 
	{	 
		evenGuess++; 
		classObject.setEvenGuess(evenGuess); 
	if (diceNum == 2 || diceNum ==4 || diceNum == 6) 
	{ 
		JOptionPane.showMessageDialog(null,"You won! The dice has rolled an even number."); 
		win++; evenWin++; 
		classObject.setWin(win); classObject.setEvenWin(evenWin); 
	} 
 	else 
 	{	 
		JOptionPane.showMessageDialog(null,"You Lose. The dice rolled an odd number."); 
		oddDice++; 
		classObject.setOddDice(oddDice++); 
	} 
	} 			 
 		playAgain = Integer.parseInt(JOptionPane.showInputDialog("\n\nPress 1 to keep playing\nPress 2 to exit and show your results ")); 
 			 
 	} 
 	while (playAgain ==1); 
 			 
 	JOptionPane.showMessageDialog(null,"-- Game Results --\n\nGames won: "+ classObject.getWin() +  
 			"\nGames played: "+ classObject.getGameCount() + "\nWinning percentage: "+ classObject.getWinPercent()+ 
			"\n% player chose an even number: "+ classObject.getEvenGuessPercent()+ 
			"\n% dice rolled an odd number: "+ classObject.getOddDicePercent()+ 
			"\nGames won with even numbers: "+ classObject.getEvenWin()+ 
			"\nGames won with odd numbers: "+ classObject.getOddWin());  
					 
			JOptionPane.showMessageDialog(null,"Thanks for playing!!."); 
 	} 
}
