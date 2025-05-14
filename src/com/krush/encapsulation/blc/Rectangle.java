package com.krush.encapsulation.blc;

public class Rectangle 
{
private double height;
private double width;

public Rectangle(double height, double width) {
	
	super();
	if(height<0||width<0) {
		System.err.println("Error: Width and height must be non-negative.");
		System.exit(0);
	}
	this.height = height;
	this.width = width;
}

public double getArea() {
	return this.height * this.width;
}

public double getPerimeter()
{
	return 2*(this.height + this.width);
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