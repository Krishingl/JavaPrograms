package com.krush.inheritance.blc;

public class Student
{
	
	protected int studentId;
	protected String name;
	protected double examFee;
	public Student(int studentId, String name, double examFee) {
		  if(studentId<=0) {
			  System.out.println("Student Id cannot be zero OR -ve");
			  System.exit(0);
		  }
		  if(examFee<0) {
			  System.out.println("Exam fees cannot be negative");
			  System.exit(0);
		  }
		  
		  if(name.isEmpty()|| name.equals("null")) {
			  System.out.println("Name cannot be null or blank");
			  System.exit(0);
		  }
		  
		  
		  
		this.studentId = studentId;
		this.name = name;
		this.examFee = examFee;
	}
	
	
	

}  
