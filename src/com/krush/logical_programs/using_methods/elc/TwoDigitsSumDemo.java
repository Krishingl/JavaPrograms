package com.krush.logical_programs.using_methods.elc;
import java.util.Scanner;

import com.krush.logical_programs.using_methods.blc.TwoDigitsSum;
public class TwoDigitsSumDemo {
	public static void main(String[] args) 
	{
		System.out.print("Enter the number : ");
		Scanner sc=new Scanner(System.in);
		int num = sc.nextInt();
		  int sumOfDigits=TwoDigitsSum.getSumOfDigits(num);
		  
		  
		  
		  if(sumOfDigits==-3){
			  System.out.println("Given value is negative not allow.");
			  
		  }else
			  if(sumOfDigits==-2){
				  System.out.println("Given value is out of the range(10-99).");
				  
			  }else 
				  if(sumOfDigits==-1){
					  System.out.println("given value is in between 0 and 9 its below the range(10-99).");
					  
				  }else
				  {
					  System.out.print("Sum of digits is : "+TwoDigitsSum.getSumOfDigits(num));
				  }
			  
			  
			  
			  
			  
			  sc.close();
		
	}

}

/*
 * Q3)
Define a method which returns the sum of digits of the given two digit number.



Write the method with the following specifications: 

Name of the BLC class:TwoDigitsSum

Name of method: getSumOfDigits()

Access Modifier : public, static

Arguments: one argument of type integer

Return type: int



This method accepts an integer value as argument and return the sum of it's digits.



Specifications: The value returned by the method getSumOfdigits() is determined by the following rules:



if the given value is in between 10 and 99, return sum of it's digits. Example: if x = 34, return 7

if the given value is negative, return -3

if the given value is greater than 99, return -2

if the given value is in between 0 and 9, return -1
 */
