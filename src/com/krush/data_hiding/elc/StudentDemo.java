package com.krush.data_hiding.elc;
import java.util.Scanner;

import com.krush.data_hiding.blc.Student;
public class StudentDemo {

	public static void main(String[] args) {
	
		
		Scanner sc=new Scanner(System.in);
		
	    System.out.print("Enter the name of student :");
	    
	    String name =sc.nextLine();
	    
//	    System.out.print("Enter the id :");
//		int id =sc.nextInt();
		
		System.out.println("Enter the RollNo :");
		int rollNo = sc.nextInt();
		
		
		Student student=new Student(name, rollNo);
		  
		
		System.out.println(student); //to String method call
		
		System.out.println("You want update your Roll no : ");
		sc.nextLine();
		String dUpdate=sc.nextLine();
		     
		if(dUpdate.equalsIgnoreCase("yes")) {
			
			System.out.println("Enter the Roll No :");
		 rollNo = sc.nextInt();
		 
		 
		 
		 student.setRollNo(rollNo);
		 System.out.println("Your Updated Details is "+student);
	}else System.out.println("Your Details is "+student);
		
		sc.close();
		
		

	}

}
