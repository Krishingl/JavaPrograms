package com.krush.encapsulation.elc;
import java.util.Scanner;

import com.krush.encapsulation.blc.*;

public class CheckLoanDeatils {
 
	public static void main(String[] args) {
		
		 Scanner sc= new Scanner(System.in);
		 
		 
		 
		 System.out.print("Enter Loan Amount : ");
		 double principle=sc.nextDouble();
		 
		 System.out.print("Enter Interest Rate ");
		 double loanInteRest=sc.nextDouble();
		 
		 System.out.print("Enter number of months for Loan : ");
		 int durationMonths=sc.nextInt();
		 
		 Loan ln= new Loan(principle, loanInteRest, durationMonths);
		 
		 
	       
		 System.out.println("Principle : "+ln.getPrinciple());
		 System.out.println("Loan IntereRest(Yearly %) : "+ln.getInteresteRate());
		 System.out.println("Duration of Mounth : "+ln.getDurationMonths());
		 
		 sc.close();
		
		
	}
}
