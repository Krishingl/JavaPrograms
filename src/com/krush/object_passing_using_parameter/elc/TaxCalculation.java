package com.krush.object_passing_using_parameter.elc;

import com.krush.object_passing_using_parameter.blc.Manager;
import com.krush.object_passing_using_parameter.blc.Sourcing;
import com.krush.object_passing_using_parameter.blc.Employee;
import com.krush.object_passing_using_parameter.blc.TaxUntil;
import com.krush.object_passing_using_parameter.blc.Trainer;

public class TaxCalculation {

	public static void main(String[] args) {
		TaxUntil t = new TaxUntil();

		Employee emp = new Employee(121, "Raj", 120000, 122, 222);

		System.out.println(emp);
		System.out.println("Employee Gross Salary is : " + emp.calculateGrossSalarssy());

		System.out.println("Employee include tax Salary is : " + t.calculateTax(emp));
		System.out.println("----------------------------------------");

		Trainer traini = new Trainer(123, "Scott", 5000000, 3000, 3000, 3, 200);
		System.out.println(traini);
		System.out.println("Employee Gross Salary is : " + traini.calculateGrossSalary());

		System.out.println("Employee include tax Salary is : " + t.calculateTax(traini));
		System.out.println("----------------------------------------");

		Manager mg = new Manager(125, "mr.Ram", 1200000, 20000, 2000, 30000);
		System.out.println(mg);
		System.out.println("Employee Gross Salary is : " + mg.calculateGrossSalary());

		System.out.println("Employee include tax Salary is : " + t.calculateTax(mg));
		System.out.println("----------------------------------------");

		Sourcing su = new Sourcing(134, "rajesh", 100000, 23444, 4444, 3, 3, 3000);
		System.out.println(su);
		System.out.println("Employee Gross Salary is : " + su.calculateGrossSalary());

		System.out.println("Employee include tax Salary is : " + t.calculateTax(su));

	}

}
