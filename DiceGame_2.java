import javax.swing.JOptionPane;


public class DiceGame_2 {

	public static void main(String[] args) {
		

		String namePlayer= null;
		String message=null;
		int diceCount=0;
		int playerGuess=0;
		int play = 1;
		diceCount=Integer.parseInt(JOptionPane.showInputDialog("How many dice do you want to play?"));
		namePlayer=JOptionPane.showInputDialog("Enter your name?");
		DiceGame dice = new DiceGame(namePlayer,diceCount,0);
		message=String.format("Hey %s,\nLets Play!!", dice.GetName());
		JOptionPane.showMessageDialog(null,message);
		do{
			playerGuess= Integer.parseInt(JOptionPane.showInputDialog("What's it going to be 1-Odd or 2-Even?"));
			dice.DiceRoll();
			message=String.format("Dice number is %d", dice.DiceNumber());
			JOptionPane.showMessageDialog(null,message);
			if(playerGuess==1 && dice.CheckResult()==1)
			{
				JOptionPane.showMessageDialog(null, "You win!");
				dice.SetPoint(1);
			}else
				JOptionPane.showMessageDialog(null, "You lose..");
			play=Integer.parseInt(JOptionPane.showInputDialog("Press 1-yes to play again or else press 2-no to quit the game"));
		}while(play==1);
		JOptionPane.showMessageDialog(null, dice);
	}

}

