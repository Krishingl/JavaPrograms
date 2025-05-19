package com.krush.dsa.recursion;

public class FindFactorialOfNumber {
	
	public static int funFactorial(int n)
	{
	         if(n==0) {	
	        	return 1;
	         }
	         
	       int fnm1=funFactorial(n-1); //fnm1=fn-1;
	         int fn=n*fnm1;
	         return fn;
	}
	
	public static void main(String[] args) 
	{
		
		int n=5;
		int fac=funFactorial(n);
	    
	System.out.println("factorial of "+n+" :"+fac);
	}
	
}
//Out-put==> factorial of 5 : 120
