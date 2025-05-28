package com.krush.inheritance_hierarchical.blc;

public class ScienceStudent extends Student 
{
	private int physicsMarks;
	private int chemistryMarks;
	private int mathMarks;
	public ScienceStudent(String name, int rollNumber, int physicsMarks, int chemistryMarks, int mathMarks) {
		super(name, rollNumber);
		if(physicsMarks<0||chemistryMarks<0||mathMarks<0||rollNumber<0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.physicsMarks = physicsMarks;
		this.chemistryMarks = chemistryMarks;
		this.mathMarks = mathMarks;
	}
	
	
	public void displayDetails()
	{
		super.displayDetails();
		System.out.println("Physics Marks: "+this.physicsMarks);
		System.out.println("Math Marks: "+this.mathMarks);
		System.out.println("Chemistry Marks: "+this.chemistryMarks);
	}
	public double calculatePercentage() {
		percentage= (physicsMarks+chemistryMarks+ mathMarks)/3;
				return percentage;
	}
}
