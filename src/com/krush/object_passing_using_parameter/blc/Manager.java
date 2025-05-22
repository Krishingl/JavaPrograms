package com.krush.object_passing_using_parameter.blc;

public class Manager {
	private int manageId;
	private String managerName;
	private double basicSalary;
	private double HRAPer;
	private double DAPer;
	private double projectAllowance;

	public Manager(int manageId, String managerName, double basicSalary, double hRAPer, double dAPer,
			double projectAllowance) {
		super();
		this.manageId = manageId;
		this.managerName = managerName;
		this.basicSalary = basicSalary;
		HRAPer = hRAPer;
		DAPer = dAPer;
		this.projectAllowance = projectAllowance;
	}

	public double calculateGrossSalary() {
		return (this.basicSalary + this.HRAPer + this.DAPer + this.projectAllowance);
	}

	@Override
	public String toString() {
		return "Manager [manageId=" + manageId + ", managerName=" + managerName + ", basicSalary=" + basicSalary
				+ ", HRAPer=" + HRAPer + ", DAPer=" + DAPer + ", projectAllowance=" + projectAllowance + "]";
	}

}

/*
 * Class Manager Fields: managerId: int, managerName : String, basicSalary :
 * double, HRAPer : double,DAPer : double, projectAllowance: double
 * 
 * public Method: calculateGrossSalary() - returns a double Calculate the gross
 * salary as : basicSalary +HRAPer +DAPer + projectAllowance
 * 
 * Class Trainer Fields: trainerId: int, trainerName : String, basicSalary :
 * double, HRAPer : double,DAPer : double, batchCount: int, perkPerBatch: double
 * 
 * public Method: calculateGrossSalary() - returns a double Calculate the gross
 * salary as : basicSalary +HRAPer +DAPer +(batchCount * perkPerBatch)
 * 
 * Class Sourcing Fields: sourceId: int, sourcaName : String, basicSalary :
 * double, HRAPer : double,DAPer : double, enrollmentTarget: int,
 * enrollmentReached: int, perkPerEnrollment: double Public Method:
 * calculateGrossSalary() - returns a double
 * 
 * Calculate the gross salary as : basicSalary +HRAPer +DAPer
 * +(((enrollmentReached/enrollmentTarget)*100)*perkPerEnrollment)
 * 
 * 
 * Class TaxUtil Fields: None Public Methods: calculateTax(Employee e) - returns
 * a double calculateTax(Manager m) - returns a double calculateTax(Trainer t) -
 * returns a double calculateTax(Sourcing s) - returns a double
 * 
 * Tax Calculation Logic: If gross salary is greater than 50000 tax is 20% else,
 * tax is 5%.
 * 
 * An ELC class TaxCalculation is given to you with the main Method. Use this
 * class to test your solution.
 */