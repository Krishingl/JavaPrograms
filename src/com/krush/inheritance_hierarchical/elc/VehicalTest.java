package com.krush.inheritance_hierarchical.elc;
//
//import java.util.Scanner;

import com.krush.inheritance_hierarchical.blc.Bike;
import com.krush.inheritance_hierarchical.blc.Car;

public class VehicalTest {
       public static void main(String args [])
       {
//    	   Scanner sc= new Scanner(System.in);
    	   Car car = new Car("Audi", "Q8", 2021, 4);
           System.out.println("Car Details:");
           car.displayDetails();

           Bike bike = new Bike("Yamaha", "MT-07", 2020, "Sports");
           System.out.println("\nBike Details:");
           bike.displayDetails();
    	   
    	   
       }
}
