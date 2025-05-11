package com.krush.logical_programs;
import   java.util.Scanner; //Import Scanner class

public class CheckPrimeNumber {
	
	public static void main(String[] args) {
		
		  Scanner sc=new Scanner(System.in);  // use the Scanner class to read the input from command prompt.
		  
		  //Ask to user Number
		  System.out.print("Enetr the Number : ");          
		    //nextInt() its a member of Scanner class its a non static method.
		  //thats reason create the object of Scanner class
		  int number = sc.nextInt();  //Get the number to user
		  
		  boolean isPrime=true;   
		  
		  // Prime Number finding Loop
		  for(int i = 2; i <= number/2; i++) {
			  if(number%i==0) {
				        isPrime=false;
				        break;  //Break the loop 
			  }
			  
		  }
		
			System.out.println("The Given Number is "+number+" "+(isPrime==true?"is Prime":"is Not Prime"));
		
			
			sc.close();
		
	}

}
