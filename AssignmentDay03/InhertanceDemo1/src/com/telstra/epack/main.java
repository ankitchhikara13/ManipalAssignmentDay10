
package com.telstra.epack;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1 = new employee(100,"Porvika",60000);
		System.out.println(e1.getdetails());
		
		manager m1 = new manager(200,"Sherya",70000,"HR",10);
		System.out.println(m1.getdetails());
		
		System.out.println(m1.getInsurance()+"**********");
		System.out.println(e1.getInsurance()+"**********");
		
		employee emp = new manager(201,"Neil",70000,"IT",5);
		
		System.out.println(emp.getdetails());
		
		System.out.println(m1.caltax(m1)+"**********");
		manager manager = (manager)emp;
		
		System.out.println(manager.getDeptName()+manager.getEmpCount());
		
	}

	

}

