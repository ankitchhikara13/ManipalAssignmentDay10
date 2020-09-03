package com.telstra.pack1;

public class Stadium {

	public static void main(String[] args) {
		
		Player p1 = new Player();
		Player p2 = new Player();
		
		int p1Score = p1.play();
		
		
		
		System.out.println(p1.getScoreD1());
		System.out.println(p1.getScoreD2());
		System.out.println(p1Score);
		
		
		int p2Score = p2.play();
		System.out.println(p2.getScoreD1());
		System.out.println(p2.getScoreD2());
		System.out.println(p2Score);
		
		if (p1Score>p2Score)
		  System.out.println("P1 won the game!!!");
		else
			System.out.println("P2 won the game!!!");
			
		
		

	}

}
