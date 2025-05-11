/**
 *Write a Java program to print the Fibonacci series up to n terms.
 */



package com.krush.logical_programs;
import java.util.Scanner;
public class FibonacciSeries 
{
       public static void main(String[] args) 
     {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter length of Fibonacii Series : ");
	   int length=sc.nextInt();
	   
	   
	   int f1=0,f2=1,f3=0;
	   
	   System.out.print("The fibonacii Series is : ");
	   
	   for(int i=1;i<=length;i++)
	   {
		   System.out.print(f1+" ");
		   
		   
		   f3=f1+f2;
		   f2=f1;
		   f1=f3;
		   
		   
	   }
	   
	   
	   sc.close();
	   
	}
}
