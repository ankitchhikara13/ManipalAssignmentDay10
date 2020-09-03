package com.telstra.epack;

public class employee {
	protected int empid;
	protected String empname;
	protected int bSal;
	public employee(int empid, String empname, int bSal) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.bSal = bSal;
	}
	public String getdetails() {
		return (empid+" "+empname+" "+bSal);
	}
	public int getInsurance() {
		return bSal*12*3;
	}
	public int getbSal() {
		return bSal;
	}
	public double caltax(employee emp) {
		double amt=0.0;
		
		if(emp instanceof manager) {
			amt=bSal*12*0.15;
			return amt;
			}
		if(emp instanceof programmer) {
			amt=bSal*12*0.1;
			return amt;
		}
		else {
			amt=bSal*12*0.8;
			return amt;
		}
	}
	
	

}
