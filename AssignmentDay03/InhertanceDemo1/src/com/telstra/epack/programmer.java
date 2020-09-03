package com.telstra.epack;

public class programmer extends employee {
	private int noofprojects;
	private String skillset;
	public programmer(int empid, String empname, int bSal, int noOfProjects, String skillset) {
		super(empid, empname, bSal);
		this.noofprojects = noOfProjects;
		this.skillset = skillset;
	}
	public String getdetails() {
		System.out.print("programmer class wala");
		return (super.getdetails()+ noofprojects+skillset);
	}
	//public int getInsurance() {
	//	return super.getInsurance();
	//}
	
	
	
}

