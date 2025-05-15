/*
 * Assignment : 02
---------------
Create a BLC class Product. 

Field/Attribute/Properties [Access modifier : private]

id : int
name : String
price : double
quantity : int

Take a private parameterized constructor to initialize the field so, We can call the Constructor from BLC class only.


Methods :
----------
1)
Name of the Method : createProductObject()
         Parameter : No Parameter 
       return type : Product
   Access modifier : public
   Non access modifier : static

Prompt the user to enter values for id, name, price and quantity.
Initialize a new Prodcut object with the provided values.
Return the created Product object.

2) Generate toString() method. Call createProductObject() method from toString method to display deatils.


3)
Name of the Method : calculateTotalAmount()
         Parameter : No Parameter 
       return type : double
   Access modifier : public

In this method calculate the total amount for the product (price * quantity) 

Applies a discount based on the total amount:
If total > 1000: 10% discount.
Total > 500: 5% discount.
Total <= 500: No discount.
Returns the total amount after applying the discount.

Create a ELC class TestProduct:
Main Method:

Ask the user how many Product objects they want to create.
Use a loop to call createProduct() with parameters provided by the user to create each product.

Test Case :
-----------
How many products do you want to create? 2

--- Product Details ---

Enter details for Product 1:
Product ID: 111
Product Name: Laptop
Price: 90000
Quantity: 12
Product ID: 111, Name: Laptop, Price: 90000.00, Quantity: 12, 
Total Amount (after discount): 972000.00

Enter details for Product 2:
Product ID: 222
Product Name: Camera
Price: 25000
Quantity: 10
Product ID: 222, Name: Camera, Price: 25000.00, Quantity: 10, 
Total Amount (after discount): 225000.00
**/


package com.krush.factory_method.blc;

import java.util.Scanner;

public class Product2 {
	
	private int id;
	private String name;
	private double price;
	private int quantity;
	private Product2(int id, String name, double price, int quantity) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product2 [id=" + id + ", name=" + name + ", price=" + price + ", quantity=" + quantity +"Total Amount (after discount): "+calculateTotalAmount()+ "]";
	}
	
	
	public static Product2 createProductObject(){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Product Id :");
		int id=Integer.parseInt(sc.nextLine());
		System.out.print("Enter the Product Name :");
		String name=sc.nextLine();
		System.out.print("Enter the Price Name :");
		double price=Double.parseDouble(sc.nextLine());
		
		System.out.print("Enter the Product Quantity :");
		int quantity=Integer.parseInt(sc.nextLine());
	     
		
		return new Product2(id, name, price, quantity);
		
		
		
	}
      public  double calculateTotalAmount() {
    	  

            double total = this.price * this.quantity;
    	  if(total >1000)
    	  {
    		  total=total-(total*0.10);
    	  }else if(total>500) {
    		  total=total-(total*0.05);
    	  } 
    	  
    	  return total;
      }

}
