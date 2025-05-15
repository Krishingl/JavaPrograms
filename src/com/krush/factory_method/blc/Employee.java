/*
Assignment : 01
---------------
Create a BLC class Employee. 

Field/Attribute/Properties [Access modifier : private]

name : String
id : int
department : String
salary : double

Take a private parameterized constructor to initialize the field so, We can call the Constructor from BLC class only.

Methods :
----------
1)
Name of the Method : createEmployeeObject()
         Parameter : No Parameter 
       return type : Employee
   Access modifier : public
   Non access modifier : static

Prompt the user to enter values for name, id, department and salary.
Initialize a new Employee object with the provided values.
Return the created Employee object.

2) Generate toString() method. Call calculateAnnualSalary() method from
   this method to display deatils.

3)
Name of the Method : calculateAnnualSalary()
         Parameter : No Parameter 
       return type : double
   Access modifier : public
  
In this method with the help of switch case calculates and returns the annual salary of the employee based on their salary (monthly salary).
Adds a bonus based on the department:
Sales: 10% bonus of annual salary.
Engineering: 15% bonus of annual salary.
HR: 8% bonus of annual salary.
Other: 5% bonus of annual salary.

Create an ELC class TestEmployee with Main Method:

Ask the user how many Employee objects they want to create.
Use a loop to call createEmployeeObject() to create the specified number of employees to print the deatils as shown in the Test case.

Test Case :
-------------
How many employees do you want to create? 2

--- Employee Details ---

Enter details for Employee 1:
Enter Employee ID: 111
Enter Employee Name: Scott
Enter Monthly Salary: 40000
Enter Department (Sales, Engineering, HR, Other): HR
ID: 111, Name: Scott, Department: HR, Monthly Salary: 40000.00, 
Annual Salary (with Bonus): 518400.00

Enter details for Employee 2:
Enter Employee ID: 222
Enter Employee Name: Smith
Enter Monthly Salary: 60000
Enter Department (Sales, Engineering, HR, Other): Sales
ID: 222, Name: Smith, Department: Sales, Monthly Salary: 60000.00, 
Annual Salary (with Bonus): 792000.00


**/



package com.krush.factory_method.blc;

import java.util.Scanner;

public class Employee {
	
	private String name;
	private int id;
	private String deparment;
    private double salary;
	private Employee(String name, int id, String deparment, double salary) {
		
		super();
		
		if(name.isEmpty() || id<=0 || deparment.isEmpty() || salary<=0) {
			System.err.println("Invalid Value All Field must Be Required ");
			System.exit(0);
		}
		this.name = name;
		this.id = id;
		this.deparment = deparment;
		this.salary = salary;
	}
	
	public static Employee createEmployeeObject() {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Employee Name :");
		String name=sc.nextLine();
		
		System.out.print("Enter the Employee Id :");
		int id=sc.nextInt();
		
		System.out.print("Enter the Deparment Name(Sales, Engineering, HR, Other) :");
		sc.nextLine();
		String deparment=sc.nextLine();
		
		System.out.print("Enter the Salary Name :");
		
		double salary=sc.nextDouble();
		
		
		
		return new Employee(name, id,deparment , salary);   //it return the  Employee type  Object
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", deparment=" + deparment + ",Monthly salary=" + salary +"Annual Salary (with Bonus): "+this.calculateAnnualSalary()+ "]";
	}
	
	public double calculateAnnualSalary() {
		
		      String dep= this.deparment;
		      
		      switch(dep.toUpperCase()) 
		      {
		      case "Sales": salary=((salary * 0.10)+salary)*12;
		      break;
		      case "Engineering": salary=((salary * 0.15)+salary)*12;
		      break;
		      case "HR": salary=((salary * 0.08)+salary)*12;
		      break;
		      default: salary= ((salary * 0.05)+salary)*12;
		      break;
		      
		      }
		
		      return salary;
	
	}
	
	
       
}
