package com.qa.main;

public class Tax {
	public float Annual_salary= 0;


	public void userName (String name) {
		
		system.out.println("User Name: " + name);

	}
	
	public void Salary (float salary) {
		Annual_salary =Annual_salary  += salary;
		
		System.out.println("Annual: " + salary);
		System.out.println("Monthly: " + salary/12);
		System.out.println("Daily: " + salary/365);
		
	}
	
	public void Tax_Category () {
		if (Annual_salary <= 21000 && Annual_salary < 32500) {
			system.out.println("Tax Band 10% paying: " + (Annual_salary * 0.1);
		} else if (Annual_salary > 21000 && Annual_salary <= 32500) {
			system.out.println("Tax Band 20% paying: " + (Annual_salary * 0.2);;
	 
	} else {
		system.out.println("Tax Band 40% paying: " + (Annual_salary * 0.4);
	}

	}
}
