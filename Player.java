import java.util.ArrayList;

public class Player extends Person{
	String name="";
	private int chips;
	private int bet=0;
	
	
	private Table tbl;
	
	public Player(String name, int chips) 
	{
		this.name = name ;
		this.chips = chips;
	}
	
	public String get_name()
	{
		return name;
	}
	
	public int make_bet() 
	{
		bet=1;
		return bet;
	}

	@Override
	public boolean hit_me(Table table) 
	{
		boolean aa=false;
		if(getTotalValue()<=16)
		{
			aa=true;
		}
		return aa;
	}

	public int get_current_chips() 
	{
		return chips;
	}
	
	public void increase_chips (int diff) 
	{
		chips+=diff;
	}
	
	public void say_hello()
	{
		System.out.println("Hello, I am " + name + "."); 
		System.out.println("I have " + chips + " chips.");
	}
	
}