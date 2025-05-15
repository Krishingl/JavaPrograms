
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





package com.krush.factory_method.elc;
import java.util.Scanner;
import com.krush.factory_method.blc.Employee;
public class TestEmployee {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.print("How many object you want enter here :");
		
		int noOfObject=sc.nextInt();
		
		
		for(int i=1;i<=noOfObject;i++) {
			
			Employee emp=Employee.createEmployeeObject();    
			
			System.out.println(emp);  //toString Method calling
			
		}
  sc.close();
	}

}


