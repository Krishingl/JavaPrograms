package com.krush.copy_constructor;
import java.util.Scanner;

public class EmployeeToManagerPromotion
{
	public static void main(String[] args) 
	{ Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Employee Name : ");
		String name =sc.nextLine();
		System.out.print("Enter the Employee ID : ");
		int  id =sc.nextInt();
		System.out.print("Enter the Employee Salary : ");
		double  sal =sc.nextDouble();
		
		Employee emp=new Employee(id,name,sal);
		
		Manager mg=new Manager(emp);
		
		System.out.println("Before pramotion.");
		System.out.println(emp);
		
		System.out.println("===========================================");
		
		System.out.println("After promotion.");
		System.out.println(mg);
		
		sc.close();
		
	}

}
