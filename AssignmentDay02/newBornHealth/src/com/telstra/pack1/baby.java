package com.telstra.pack1;

public class baby {
	private double weight;
	private String time;
	private String date;
	
	public baby(double weight,String time,String date) {
		super();
		this.weight = weight;
		this.time=time;
		this.date=date;
	}

	public void isHealthy() {
		if(weight<1) {
			System.out.println("undernutritioned");
		}
		if(weight>1&&weight<=2.5) {
			System.out.println("healthy");
		}
		else {
			System.out.println("overnutritioned");
		}
	}

}
