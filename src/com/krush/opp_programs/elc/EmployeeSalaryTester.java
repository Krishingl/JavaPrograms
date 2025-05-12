package com.krush.opp_programs.elc;

import com.krush.opp_programs.blc.Employee;

public class EmployeeSalaryTester {

	
	public static void main(String[] args) 
	{
		Employee emp =new Employee("John", "Doe", 101, 50000.00, 7);
		emp.calculateSalary();
		System.out.println(emp);
		
		Employee emp2 =new Employee("Michael", "Johnson", 105, 50000.00, -5);
		emp.calculateSalary();
		System.out.println(emp2);
		
		
	}
}
