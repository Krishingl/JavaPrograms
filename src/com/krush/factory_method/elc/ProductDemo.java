package com.krush.factory_method.elc;

import java.util.Scanner;

import com.krush.factory_method.blc.Product;

public class ProductDemo {
	
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	    
		
		System.out.println("How many Products Object You want for :");
		
		int noOfObject=sc.nextInt();
		
		for(int i=1;i<=noOfObject;i++)
		{
			Product product =Product.getProcductObject();
			
			System.out.println(product);   // to print the objects data 
		}
		
		sc.close();
	}

}
