public class Odd_EvenGameObjects { 

private String player; 
private double win=0, evenWin = 0, oddWin = 0; 
private double evenGuess = 0, oddDice=0; 
public int gameCount = 0; 	 
public Odd_EvenGameObjects (String player) 
{ 
	this.player = player; 
} 

public void setName (String name) 
{ 
	this.player = name; 
} 
	public String getName() 
{ 
	return player; 
} 
	public void setGameCount (int gameCount) 
{ 
	this.gameCount = gameCount; 
} 

public void setWin (double win) 
{ 
	this.win = win; 
} 
public void setEvenWin (double evenWin) 
{ 
	this.evenWin = evenWin;  	} 
public void setOddWin (double oddWin)	 
{ 
	this.oddWin = oddWin; 
}  	public void setEvenGuess (double evenGuess) 
{ 
	this.evenGuess = evenGuess; 
} 
public void setOddDice (double oddDice) 
{ 
	this.oddDice = oddDice; 
} 
public double getWin() 
{ 
	return win; 
} 
public double getOddWin() 
{ 
	return oddWin; 
} 
public double getWinPercent() 
{ 
	double winPercent = (win/(double)(gameCount-1))*100; 
	return Double.parseDouble(String.format("%.0f",winPercent)); 
} 
public double getEvenWin() 
{ 
	return evenWin; 
} 
public double getEvenGuessPercent() 
{ 
	double evenGuessPercent = (evenGuess/(double)(gameCount-1))*100; 
	return Double.parseDouble(String.format("%.0f",evenGuessPercent)); 
} 
public double getOddDicePercent() 
{ 
	double oddDicePercent = (oddDice/(double)(gameCount-1))*100; 
	return Double.parseDouble(String.format("%.0f", oddDicePercent)); 
} 
public int getDiceNum() 
{ 
	int randomNum = 1 + (int)(Math.random()*6); 
	return randomNum; 
} 
public int getGameCount() 
{ 
	return gameCount-1; 
} 


} 
