package com.krush.dsa.recursion;

public class FabonacciSeries {
	  static int f1=0;
     static  int f2=1;
    static   int f3;
	
	
	public static void main(String[] args) {
		
		
		int n=5;
	
		
		   displayFabonacciSeries(n);
	}
  public static  void    displayFabonacciSeries(int n) {
	     
	  
	      if(n==1) {
	    	  
	    	 
	    	    
	    	  System.out.println(f1);
	    	  return;
	      }
	     
	     
	  displayFabonacciSeries(n-1);
	  f3=f2+f1;
      f2=f1;
    f1=f3;
	    System.out.println(f1);
  return;
  }
}
