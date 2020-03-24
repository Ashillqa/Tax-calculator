package com.qa.main;

public class Tax {
	public float Annual_salary= 0;


	public String userName (String name) {
		
		return name;

	}
	
	public void Salary (float salary) {
		Annual_salary =Annual_salary  += salary;
		
		System.out.println("Annual: " + salary);
		System.out.println("Monthly: " + salary/12);
		System.out.println("Daily: " + salary/365);
		
	}
	
	public String Tax_Category () {
		if (Annual_salary <= 21000 && Annual_salary < 32500) {
			return "10% tax";
		} else if (Annual_salary > 21000 && Annual_salary <= 32500) {
			return "20% tax";
	 
	} else {
		return "40% tax";
	}

	}
}
