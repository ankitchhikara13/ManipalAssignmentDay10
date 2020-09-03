package com.telstra.pack1;

public class Player{
	
	// How to encapsulate the data members  and how to bind the members with methods 
	// Relationship called aggregation   : has - A  relationship 
	private Dice d1;
	private Dice d2;
	
	
	public Player() {
		super();
		d1 = new Dice();
		d2 = new Dice();
	}
	
	public int play()
	{
		return(d1.roll()+d2.roll());
	}
// Gettter methods --> to access the private members of the class if necessary 
	/*public Dice getD1() {
		return d1;
	}

	public Dice getD2() {
		return d2;
	}*/
	
	public int getScoreD1()
	{
		return d1.getfValue();
	}
	
	public int getScoreD2()
	{
		return d2.getfValue();
	}
	

}
