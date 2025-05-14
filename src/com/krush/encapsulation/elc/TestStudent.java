/**
 Assignment 03 :
---------------
Create a BLC class Student.

Fields/Attributes [Access modifier must be private]

name (String): The name of the student.
age (int): The age of the student.
grade (String): The grade of the student.

In addition to these attributes, implement the following:

Static Method: Create a static method called createStudent() in the Student class. This method should:

Prompt the user to enter values for name, age, and grade.
Initialize a new Student object with the provided values.
Return the created Student object.

Implement a toString() to the Student class, which prints the student's details in the format: "Name: <name>, Age: <age>, Grade: <grade>".

Create a ELC class TestStudent
Main Method: In the main method, write code to:

Ask the user for the number of Student objects they want to create.
Use a loop to call the createStudent() method the specified number of times, 
After creating all Student objects, use a loop to display the details of each student using the toString method.*/






package com.krush.encapsulation.elc;
import com.krush.encapsulation.blc.*;
import java.util.Scanner;

public class TestStudent {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.print("How many Student object you want to create : ");
              
		int noOfObj = sc.nextInt();
		
		
		
		for(int i=1;i<=noOfObj;i++)
		{
			Student stu=Student.createStudent();
			System.out.println(stu);
		}
		
		sc.close();
	}

}
