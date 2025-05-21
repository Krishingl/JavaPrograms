package com.krush.logical_programs.using_methods;

import java.util.Scanner;

public class NumberIsPalindrome 
{
	
	  static Scanner sc= new Scanner(System.in);
	public static void main(String[] args) 
	{
	   
		
		  System.out.print("Enter the Number : ");
		  int num = sc.nextInt();
		  
		
		  System.out.println(isPalindrome(num)?"The number is palindrome ":"The number is not Palindrome");
		  
	}
	public static boolean isPalindrome(int num)
	{    int temp=num;
	     int rev=0;
	     boolean flag = false;
	     while(temp!=0) 
	     {
	    	 rev=rev *10+temp%10;
	    	 temp/=10;
	     }
	      if(num ==rev) {
	    	  flag=true;
	      }
	     return flag;
	     
		
	}

}


/*1)Define a method which returns true if the given three digit number is palindrome otherwise return false.



Write the method with the following specifications: 



Name of method : isPalindrome()

   Modifiers : public, static

  return type : boolean

   Argument : one argument of type integer



This method accepts an integer value as argument and 

return true if the given number is palindrome, else retrun false.

*/