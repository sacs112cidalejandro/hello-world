public class DiceGame {
	private int diceNumber=0;
	private int point=0;
	private int diceCount=0;
	private String userName=null;
	private int diceResult=0;
	public DiceGame(String name,int diceCount,int point)
	{
		userName=name;
		this.diceCount=diceCount;
		this.point=point;
	}
	public String GetName()
	{
		return userName;
	}
	public void SetPoint(int point)
	{
		this.point=point+this.point;
	}
	public void DiceRoll()
	{
		diceNumber=diceCount*(1+(int)(Math.random()*6));
	}
	public int CheckResult()
	{
		if(diceNumber%2==0)
			diceResult=2;//1 is odd
		else diceResult=1; // 2 is Even
		return diceResult;
	}
	public int DiceNumber()
	{
		return diceNumber;
	}
	public String toString()
	{
		return String.format("%s,\nplayed with %d dices.\nTotal points: %d", userName, diceCount, point);
	}
}

