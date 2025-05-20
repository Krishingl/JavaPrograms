package com.krush.constructor_overloading.blc;

public class Calculates {

	
	public Calculates(int x)//100
	{  this(1000,2000); 
	    //third Execute
		System.out.println("Single parameter Constructor : "+x);
	}
	public Calculates(int x,int y)//1000, 200 
	{      this("Java "," is ","Best.");
	       //Second execute
		System.out.println("Two parameter Constructor : "+(x+y));
	}
	public Calculates(String x,String y,String z)//Java , is , Best. 
	{  //first Execute
		System.out.println("Three parameter Constructor : "+(x+y+z));
	}
}
