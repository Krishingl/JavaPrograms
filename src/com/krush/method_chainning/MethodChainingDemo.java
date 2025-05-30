package com.krush.method_chainning;
import java.util.Scanner;
public class MethodChainingDemo
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		
		System.out.print("Enter any word here : ");
		String str=sc.next(); // its use to read a single word from console;
		//method chaining is a process to call multiple method in a single statement.
		
		char ch=str.toLowerCase().toLowerCase().charAt(0);  
		//after character we can not call any other method
		 // Because its return type in char. and char is the primitive return type
		  // we cannot call using primitive return type another method only.
		     //reference data type use we can call the another but same type of method. 
		//note :==> method chaining  data type depends on the last called method.
		System.out.println("Method chaining  using find fist character in the given Word : "+ch);
		
		// Example 2 :--
		
		
	String country="India";
	
	
	String feedback=country.concat(" is great").toUpperCase();
		
		
		System.out
		.println("My feedback : "+feedback);

		
		
		
		
		
		sc.close();
	}
}
