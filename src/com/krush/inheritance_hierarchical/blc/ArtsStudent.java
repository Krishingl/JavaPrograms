package com.krush.inheritance_hierarchical.blc;

public class ArtsStudent extends Student
{
	private int historyMarks;
	private int geographyMarks;
	private int englishMarks;
	public ArtsStudent(String name, int rollNumber, int historyMarks, int geographyMarks, int englishMarks) {
		super(name, rollNumber);
		if(historyMarks<0||geographyMarks<0||englishMarks<0||rollNumber<0) {
			System.err.println("Error Invalid Input");
			System.exit(0);
		}
		this.historyMarks = historyMarks;
		this.geographyMarks = geographyMarks;
		this.englishMarks = englishMarks;
	}
	
	public void displayDetails()
	{   
		super.displayDetails();
		System.out.println("Physics Marks: "+this.historyMarks);
		System.out.println("Math Marks: "+this.geographyMarks);
		System.out.println("Chemistry Marks: "+this.englishMarks);
	}
	public double calculatePercentage() {
		percentage= (historyMarks+geographyMarks+ englishMarks)/3;
				return percentage;
	}
	
}
