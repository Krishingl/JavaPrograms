package com.krush.copy_constructor;

public class Manager 
{

	
 private int managerId;
 private String managerName;
 private double managerSalary;
 private  double salIncrement;
 public Manager(Employee emp) {
	 
	 this.managerId=emp.getEmployeeId();
	 this.managerName=emp.getEmployeeName();
	 salIncrement=emp.getEmployeeSalary()*0.20;// increment in manager Salary 20% increment
	 this.managerSalary=emp.getEmployeeSalary()+salIncrement;
	 
	 
 }
 

@Override
public String toString() {
	return "Manager [managerId=" + managerId + ", managerName=" + managerName +", Salary Increment :"+this.salIncrement+", Final Manager Salary :"+this.managerSalary+ "]";
}


	
}
