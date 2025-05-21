package com.krush.logical_programs.using_methods;
import java.util.Scanner;
public class FindGreatestNumber {
	static Scanner sc=new Scanner(System.in);

	  public static void main(String[] args)
	  {
		  System.out.print("Enter the first number : ");
		  int n1=sc.nextInt();
		  sc.nextLine();
		  System.out.print("Enter the second number : ");
		  int n2=Integer.parseInt(sc.nextLine());
		  System.out.print("Enter the third number : ");
		  int n3=Integer.parseInt(sc.nextLine());
		  
		  
		  int gn=getGratest(n1,n2,n3);
		   if(gn==-2) {
			   System.out.println("Zero Value are not allowed ");
		   }else  if(gn==-1) {
			   System.out.println("Negative Value are not allowed ");
		   }else {
			   System.out.println("The gratest Number is : "+gn);
		   }
		 
		
		  
	}
	  public static int getGratest(int n1,int n2,int n3)
	  {
		  if(n1==0||n2==0||n3==0) {
			  return -2;
		  }else if(n1<0||n2<0||n3<0) {
			  return -1;
	  }else {
		  
		  
		  return (((n1>n2) && (n1>n2))? n1 : (n2>n3) ? n2 : n3);
		  
		  
		  
	  }
	  }
}
/*
Define a method which returns the greatest number among three numbers.



Write the method with the following specifications: 



Name of method : getGretest()

   Modifiers : public, static

  return type : int

   Argument : three arguments of type integer  



This accepts Three integer values as argument and return the greatest value.



Arguments: three arguments of type integer

Return Type: an integer value 



Specifications: The value returned by the method getGreatest() is determined by the following rules:



if any of the given numbers are negative, return -1.

if any of the given numbers are zero, return -2.

if the given numbers are positive, return the greatest.
 */
	  
	  