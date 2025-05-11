package com.krush.oop.elc;
import com.krush.oop.blc.Car;
public class CarDemo {
	
	public static void main(String[] args) {
		   
		
		Car cr=new Car(); //Object Created 
		
		//Data Pass Throw the Parameters
		cr.setCarData("Mahendra","SUV", "Black", 5, true, false, false, 18,1765000.00 );

 
		
		
		//Display Car Data
		System.out.println(cr);  // call the toString() method 
		System.out.println("________________________________________________________");
		System.out.println("________________________________________________________");
		
		cr.openLock();
		
		System.out.println("________________________________________________________");
		
		cr.itsStart();
		
		
		System.out.println("________________________________________________________");
		
		cr.itsStop();
		
		
		System.out.println("________________________________________________________");
		
		cr.itsLock();
		
		System.out.println("________________________________________________________");
		
		
		
		
		
		
		
		
	}
	

	     

}
