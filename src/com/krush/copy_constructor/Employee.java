package com.krush.copy_constructor;

public class Employee 
{
	
     private int employeeId;
     private String employeeName;
     private double employeeSalary;
  public   Employee(int employeeId,String employeeName, double employeeSalary)
     {  
	  
	   if(employeeId<=0||employeeName.isEmpty()||employeeSalary<=0)
	   {
		   System.err.println("Error : Please Enter valid Details");
		   
	   }
	   
    	 this.employeeId=employeeId;
    	 this.employeeName=employeeName;
    	 this.employeeSalary=employeeSalary;
    	 
     }
     
     
     public int getEmployeeId() {
    	 
    	 return this.employeeId;
     }
     public String getEmployeeName() {
    	 return this.employeeName;
    	 
     }
     public double getEmployeeSalary() {
    	 return this.employeeSalary;
    	 
     }
     
     
     
     public String toString() {
    	 return "Employee"+" [ Employee Name: "+this.employeeName+", Employee Id :"+this.employeeId+" Employee Salary : "+ this.employeeSalary+" ]";
    	 
     }

}
