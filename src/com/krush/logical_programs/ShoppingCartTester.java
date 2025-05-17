
/*ShoppingCartTester
Create a class called ShoppingCart.

The class should have the following instance variables:

String item – the name of the item.

double price – the price of a single item.

int quantity – the number of items purchased.

Implement a constructor to initialize these variables.

Create a method called calculateBill() that:

Calculates the total bill as price * quantity.

Prints the item name and total amount to be paid.
create class name ShoppingCartTester which contain main method
In the main() method:

Create an object of ShoppingCart with sample data (e.g., "Laptop", 50000, 2).

Call the calculateBill() method.

Sample Input
Laptop
45000
2
Sample Output
Item:Laptop, Total Bill:90000.0**/

package com.krush.logical_programs;

import java.util.Scanner;

public class ShoppingCartTester
{
   public static void main(String args[])
   {
    Scanner sc= new Scanner(System.in);
    System.out.print("Enter product name :");
         
           String name = sc.nextLine();
     System.out.print("Enter product Price :");
            double price =sc.nextDouble();
     System.out.print("Enter product quantity :");
            int quantity=sc.nextInt();

       ShoppingCartDemo shopCart= new ShoppingCartDemo(name,price,quantity);
       
       System.out.println(shopCart.display());
       sc.close();
   }

}
class ShoppingCartDemo
{
private String itemName;
 private double price;
 private  int quantity;

   ShoppingCartDemo(String itemName,double price,int quantity)
    {if(price<0){
     System.err.println("Price Cannot be negative.");
     System.exit(0);
    }else if(quantity<0){
     System.err.println("quantity Cannot be negative.");
     System.exit(0);
    }
       this.itemName=itemName;
       this.price=price;
       this.quantity=quantity;
   
    }
      
      public  double calculateBill(){
          return price*quantity;
      }
    public String display(){
         return ""+"Item:"+itemName+", Total Bill:"+calculateBill();
    }


}