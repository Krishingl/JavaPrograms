package com.krush.encapsulation.blc;

import java.util.Scanner;

public class Student {
  private String name;
  private int age;
  private String grade;
  
  
  public Student(String name, int age, String grade) {
	super();
	this.name = name;
	this.age = age;
	this.grade = grade;
}


public static Student createStudent() 
  { 
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter Student Name : ");
	       String name= sc.nextLine();
	  System.out.println("Enter Student Age : ");
	       int age= sc.nextInt();
	  
	  System.out.println("Enter Student Grade : ");
	    sc.nextLine();
	       String grade= sc.nextLine();
	     
	  return new Student(name,age,grade);
  }


@Override
public String toString() 
{
  	return "Student [name=" + name + ", age=" + age + ", grade=" + grade + "]";
}
  

 
  
}
