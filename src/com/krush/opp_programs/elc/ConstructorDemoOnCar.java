package com.krush.opp_programs.elc;

import java.util.Scanner;

import com.krush.opp_programs.blc.Car;



public class ConstructorDemoOnCar
{
	static Scanner sc= new Scanner(System.in);  
	
	public static void main(String[] args) 
	{
		System.out.print("Enter car Company : ");
		
		String carC=sc.nextLine();
		
		System.out.print("Enter car Model : ");
		String carM=sc.nextLine();
		
		System.out.print("Enter car Manufacturing Year : ");
		int  carMYear=Integer.parseInt(sc.nextLine());
		
		
		System.out.print("Enter Car color : ");
		String carColor=sc.nextLine();
		 
		
		System.out.println("Enter The price of car : ");
		
		double carP=Double.parseDouble(sc.nextLine());
		
		System.out.print(carM+" its AirBags Availabel Or not [true/false] : ");
		boolean itsAirBags=sc.nextBoolean();
		
		System.out.print(carM+" its Sport car Or not [true/false] : ");
		boolean itsSport=sc.nextBoolean();
		
		
		  
		
		
		
		
		Car carRef = new Car(carColor, carM, carColor, carMYear, carP, itsSport, itsAirBags);
		
		
		System.out.println(carRef);
		
	}

}
