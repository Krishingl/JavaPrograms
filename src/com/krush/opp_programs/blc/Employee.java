package com.krush.opp_programs.blc;
//BLC
public class Employee {
	
	
	private String firstName;
	private String lastName;
	private int employeeId;
	private double salary;
	private int NoOfProject;
	public Employee(String firstName, String lastName, int employeeId, double salary, int noOfProject) {
		super();
		if(noOfProject<0) {
			System.err.println("Number of projects cannot be negative");
			System.out.println("Salary remains : "+salary);
			System.exit(0);
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.employeeId = employeeId;
		this.salary = salary;
		this.NoOfProject = noOfProject;
		return;
	}
	
	public void calculateSalary()
	{
		 if(NoOfProject>5 && NoOfProject<10)
		{
			this.salary+=5000;
		}else if(NoOfProject>=10 && NoOfProject<20)
		{      
			this.salary+=10000;
		}else
		{
			this.salary+=15000;
		}
		
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", employeeId=" + employeeId
				+ ", salary=" + salary + ", NoOfProject=" + NoOfProject + "]";
	}
	
	

}
