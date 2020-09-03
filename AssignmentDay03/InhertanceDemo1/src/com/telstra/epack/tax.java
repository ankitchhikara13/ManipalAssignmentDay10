package com.telstra.epack;

public class tax extends employee{
	public tax(int empid, String empname, int bSal) {
		super(empid, empname, bSal);
		// TODO Auto-generated constructor stub
	}

	public double caltax(employee emp) {
		double amt=0.0;
		
		if(emp instanceof manager) {
			amt=super.getbSal()*12*0.15;
			return amt;
			
			
			
		}
		if(emp instanceof programmer) {
			amt=super.getbSal()*12*0.1;
			return amt;
		}
		else {
			amt=super.getbSal()*12*0.8;
			return amt;
		}
	}

}
