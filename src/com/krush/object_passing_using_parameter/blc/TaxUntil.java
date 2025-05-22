package com.krush.object_passing_using_parameter.blc;

public class TaxUntil {
	public double calculateTax(Employee e) {
		double tax=0;
		if(e.calculateGrossSalary()>50000) {
			tax=e.calculateGrossSalary()*0.20;
			
		}else {
			tax=e.calculateGrossSalary()*0.05;
		}
		return (e.calculateGrossSalary()-tax);
	}
	
	
	
		public double calculateTax(Manager m) {
			double tax=0;
			if(m.calculateGrossSalary()>50000) {
				tax=m.calculateGrossSalary()*0.20;
				
			}else {
				tax=m.calculateGrossSalary()*0.05;
			}
			return (m.calculateGrossSalary()-tax);
		}
		
		public double calculateTax(Trainer t) {
			double tax=0;
			if(t.calculateGrossSalary()>50000) {
				tax=t.calculateGrossSalary()*0.20;
				
			}else {
				tax=t.calculateGrossSalary()*0.05;
			}
			return (t.calculateGrossSalary()-tax);
		}
		
		public double calculateTax(Sourcing s) {
			double tax=0;
			if(s.calculateGrossSalary()>50000) {
				tax=s.calculateGrossSalary()*0.20;
				
			}else {
				tax=s.calculateGrossSalary()*0.05;
			}
			return (s.calculateGrossSalary()-tax);
		}
		
		
	

}


/*
Class TaxUtil
Fields: None
Public Methods:
calculateTax(Employee e) - returns a double
calculateTax(Manager m) - returns a double
calculateTax(Trainer t) - returns a double
calculateTax(Sourcing s) - returns a double

Tax Calculation Logic: If gross salary is greater than 50000 tax is 20% else, tax is 5%.

An ELC class TaxCalculation is given to you with the main Method. Use this class to test your solution.*/