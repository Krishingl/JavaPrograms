package com.krush.object_passing_using_parameter.blc;

public class Sourcing {
	
	private int sourceId;
	private String sourceName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	private int enrollmentTarget;
	private int enrollmentReached;
	private double perkPerEnrollment;
	
	
	
	
	public Sourcing(int sourceId, String sourceName, double basicSalary, double hRAPer, double dAPer,
			int enrollmentTarget, int enrollmentReached, double perkPerEnrollment) {
		super();
		this.sourceId = sourceId;
		this.sourceName = sourceName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.enrollmentTarget = enrollmentTarget;
		this.enrollmentReached = enrollmentReached;
		this.perkPerEnrollment = perkPerEnrollment;
	}




	public double calculateGrossSalary() {
		return (this.basicSalary +this.HRAPer +this.DAPer+ +(((this.enrollmentReached/this.enrollmentTarget)*100)*this.perkPerEnrollment));
	}




	@Override
	public String toString() {
		return "Sourcing [sourceId=" + sourceId + ", sourceName=" + sourceName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", enrollmentTarget=" + enrollmentTarget
				+ ", enrollmentReached=" + enrollmentReached + ", perkPerEnrollment=" + perkPerEnrollment + "]";
	}
	
	

}
/*

Class Sourcing
Fields: sourceId: int, sourcaName : String, basicSalary : double, HRAPer : double,DAPer : double, enrollmentTarget: int, enrollmentReached: int, perkPerEnrollment: double
Public Method: calculateGrossSalary() - returns a double

Calculate the gross salary as : basicSalary +HRAPer +DAPer +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)


Class TaxUtil
Fields: None
Public Methods:
calculateTax(Employee e) - returns a double
calculateTax(Manager m) - returns a double
calculateTax(Trainer t) - returns a double
calculateTax(Sourcing s) - returns a double

Tax Calculation Logic: If gross salary is greater than 50000 tax is 20% else, tax is 5%.

An ELC class TaxCalculation is given to you with the main Method. Use this class to test your solution.
*/