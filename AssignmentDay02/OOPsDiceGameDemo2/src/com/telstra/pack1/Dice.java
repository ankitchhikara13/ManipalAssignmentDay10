package com.telstra.pack1;

import java.util.Random;

public class Dice {
	private int fValue;
	
	public int roll()
	{
		Random rand= new Random();
		fValue = (int)rand.nextInt(5)+1;
		return(fValue ); // 1+5 = 6
	}

	public int getfValue() {
		return fValue;
	}
	
	

}
