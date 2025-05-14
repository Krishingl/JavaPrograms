package com.krush.encapsulation.elc;

import java.util.Scanner;

import com.krush.encapsulation.blc.Employee;

public class EmployeeTester {

	public static void main(String[] args) {
		
	
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter Id : ");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enetr Employee Name: ");
		
		String name=sc.nextLine();
		System.out.print("Enetr Employee salary: ");
		double salary = Double.parseDouble(sc.nextLine());
		
		
		
		Employee emp=new Employee(id, name, salary);
		
		
		System.out.println("----------------------------------------------"+'\n'+'\n');
		System.out.println(emp);
	
		if(emp.getEmployeeSalary()>=60000)
		{
			System.out.println("Employee is a Developer");
			
		}else if(emp.getEmployeeSalary()>=40000)
		{
			System.out.println("Employee is a Designer");	
		}else if(emp.getEmployeeSalary()<40000) {
			System.out.println("Employee is a Tester");	
		}
		
		
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
	}
	
	
}
