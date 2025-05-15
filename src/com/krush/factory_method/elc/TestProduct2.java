package com.krush.factory_method.elc;
import com.krush.factory_method.blc.Product2;

import java.util.Scanner;

public class TestProduct2 {

	public static void main(String[] args) 
	{
          Scanner sc = new Scanner(System.in);
          
          System.out.println("How many products do you want to create?");
          int noOfObject=sc.nextInt();
             
             
             for(int i=1;i<=noOfObject;i++)
             {
            	 System.out.println("--- Product Details ---");
            	 Product2 product = Product2.createProductObject();
            	 
            	 System.out.println(product);
             }
             sc.close();
	}

}
