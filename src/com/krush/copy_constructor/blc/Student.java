package com.krush.copy_constructor.blc;

public class Student {
	
	private String name;
	private int marks;
	public Student(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "name";
	}
	

}

/*
 * 
Create a program to find out the Student Grade based on Student Marks :

Create a BLC class Student

Instance Variables :
name : String : private 
marks : int : private

Create a parameterized constructor to initialize all the fields.

Define setter and getter for all fields.

Override toString() method which will return only the name of the 
student from this method.
 */

