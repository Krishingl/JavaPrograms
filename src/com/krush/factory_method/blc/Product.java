package com.krush.factory_method.blc;

import java.util.Scanner;

//blc class
public class Product
{
    private int id;
    private String name;
    private double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
    
    public static Product getProcductObject() //Static Factory Method 
    {
    	Scanner sc= new Scanner(System.in);
    	System.out.print("Enter the Product ID : ");
    	int pId=Integer.parseInt(sc.nextLine());
    	System.out.print("Enter the Product Name : ");
    	String pName=sc.nextLine();

    	System.out.print("Enter the Product Price : ");
    	Double pPrice=Double.parseDouble(sc.nextLine());
    	
         Product product=new Product(pId, pName, pPrice);
         
    	
    	return product;
    }

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
    
    
}
