package com.krush.inheritance_hierarchical.blc;

public class Student {
	protected String name;
	protected int rollNumber;
	 static protected double percentage;
	public Student(String name, int rollNumber) 
	{
		this.name=name;
		this.rollNumber=rollNumber;
	}
	public double calculatePercentage() {
		return percentage;
	}
	
	public void displayDetails() {
		System.out.println("Science Student Details:"+'\n'+"Name: "+this.name+'\n'+"Roll Number: "+this.rollNumber);
	}
}
