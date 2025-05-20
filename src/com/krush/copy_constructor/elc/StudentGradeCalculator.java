package com.krush.copy_constructor.elc;
import java.util.Scanner;

import com.krush.copy_constructor.blc.CalculateStudentGrade;
import com.krush.copy_constructor.blc.StudentGrade;
import com.krush.copy_constructor.blc.Student;

//import com.krush.copy_constructor.blc.CalculateStudentGrade;
public class StudentGradeCalculator {

	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
	System.out.print("How many Student object you want ");
	   
	int n= sc.nextInt();
	  
	for(int i=1;i<=n;i++) {
		System.out.println("-------Student "+i+" garade-----");
		   System.out.print("Enter Student name : ");
		   
		   String name=sc.nextLine();
		   sc.nextLine();
		   
		   System.out.print("Enter Student Marks : ");
		  
		   int marks=sc.nextInt();
		   Student stu=new Student(name,marks);
		 
		  StudentGrade sg=  CalculateStudentGrade.calculateGrade(stu);
		  System.out.println(sg);
		  sc.close();
		  
	}
	
	
	
	}
}
