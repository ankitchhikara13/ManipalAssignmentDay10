package com.telstra.epack;

public class manager extends employee {
private String deptname;
private int empcount;
public manager(int empid, String empname, int bSal, String deptname, int empcount) {
	//constructor chaining is achived using super() super of
	super(empid, empname, bSal);
	this.deptname = deptname;
	this.empcount = empcount;
}
public String getdetails() {
	
	return (super.getdetails()+deptname+empcount);
	
}
//public int getInsurance() {
//	return super.getInsurance();
//}
public String getDeptName() {
	return deptname;
}
public int getEmpCount() {
	return empcount;
}

}
