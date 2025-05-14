package com.krush.encapsulation.blc;

public class Employee {

	
	
	
	private int employeeNumber;
	private String employeeName;
	private double employeeSalary;
	
	//Constructor
	public Employee(int employeeNumber, String employeeName, double employeeSalary) {
		  
		if(employeeNumber <0 )
		{
			this.employeeNumber=0;
			System.err.println("id must be always positive integer");
		}else {
			this.employeeNumber = employeeNumber;
		}
		if(employeeSalary<=0) 
		{
			this.employeeSalary=0.0;
			System.err.println("Fee cannot be negative");
		}else
		{
			this.employeeSalary = employeeSalary;
		}
		if(employeeName.isEmpty()) 
		{
			
			this.employeeName="";
			System.err.println("name must initialize with any default name");
			
			System.exit(0);
			
		}else	
		{
			
			this.employeeName = employeeName;
		}
		
		
		
	}

	public int getEmployeeNumber() {
		return employeeNumber;
	}

	public void setEmployeeNumber(int employeeNumber) {
		this.employeeNumber = employeeNumber;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
		
		
	
	}
	
	
	
	
}
