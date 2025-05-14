package com.krush.encapsulation.elc;
import java.util.Scanner;

import com.krush.encapsulation.blc.Rectangle;
public class RectangleDemo 
{
   public static void main(String[] args) {
	
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Enter Width and Height of Retangle one by one.");
	   System.out.print("Enter the width :");
	   double wh=sc.nextDouble();

	   System.out.print("Enter the width :");
	   double ht=sc.nextDouble();
	   
	   
	   Rectangle rec=new Rectangle(ht, wh);
	   
	   System.out.println("----------------------------------------------");
	        
	   System.out.println("Area of Retangle is :"+rec.getArea());
	   
	   System.out.println("Perimeter of Retangle is :"+rec.getPerimeter());
	   
	   sc.close();
}
}




/**



Note : Don't use toString() method

Take one Main class ELC class which is having main method,
Create a Rectangle object with width 5 and height 10 and call
the getArea() and getPerimeter() methods on it.


Test Cases -1 :
------------------
Valid Case: width = 5, height = 10

Sample Input: width = 5, height = 10

Expected Output:

Area: 50.0
Perimeter: 30.0

Test Cases -2 :
------------------
Invalid Case: Negative width

Sample Input: width = -5, height = 10

Expected Output:

Error: Width and height must be non-negative.*/