package com.krush.copy_constructor.blc;


public class CalculateStudentGrade
{
	public static StudentGrade calculateGrade(Student student)  {
		

		//System.out.print("Enter Student Name : ");
		String name=student.getName();
		
		int marks=student.getMarks();
		
		student.setName(name);
		student.setMarks(marks);
//		int marks=student.getMarks();
		char grade;
          if(marks>90) 
          {
        	  grade='A';
          }
          else if(marks >= 75) 
          {
        	  grade='B';
          }
          else if(marks >= 60 )
          {
        	  grade='C';
          }else
          {
        	  grade='D';
          }
		
		return new StudentGrade(student, grade);
	}
	

}



/*
Create another class CalculateStudentGrade which does not contain any field (Variable)

Methods :
Name of the Method : calculateGrade()  [Factory Method]
return type : StudentGrade 
Access Modifier : public, static
Argument : Student 

In calculateGrade() method, task is to find the Student grade based on the Student marks and create and return the StudentGrade
object on the following criteria :

Student Marks                 Grade
> 90                            A
>= 75                           B
>= 60                           C
< 60                            D

*/