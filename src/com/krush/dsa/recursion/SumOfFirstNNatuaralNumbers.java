package com.krush.dsa.recursion;

public class SumOfFirstNNatuaralNumbers 
{   
	static int sum=0;
     public static void main(String[] args) {
		
    	 
    	 
    	 int n=5;
    	  
    	 sum= calSum(n);
    	 System.out.println("The of "+n+" Natural number is  "+sum);
	}
     
     
     public static int calSum(int n) 
     {
    	 if(n==1) {
    		 return 1;
    	 }
    	
    	 sum = n +calSum(n-1);
    	 
    	 
    	 return sum;
     }
}
