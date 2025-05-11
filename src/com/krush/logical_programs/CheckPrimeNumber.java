package com.krush.logical_programs;
import   java.util.Scanner;

public class CheckPrimeNumber {
	
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);
		  
		  //Ask to user Number
		  System.out.print("Enetr the Number : ");          
		  
		  int number = sc.nextInt();  //Get the number to user
		  
		  boolean isPrime=true;
		  
		  
		  for(int i = 2; i <= number/2; i++) {
			  if(number%i==0) {
				        isPrime=false;
				        break;  
			  }
			  
		  }
		
			System.out.println("The Given Number is "+number+" "+(isPrime==true?"is Prime":"is Not Prime"));
		
		
	}

}
