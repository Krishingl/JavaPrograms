package com.krush.inheritance.elc;
import java.util.Scanner;

import com.krush.inheritance.blc.DayScholar;
import com.krush.inheritance.blc.Hosteller;

public class StudentFeeManagementSystem
 {
  static  Scanner sc= new Scanner(System.in);
     
  public static void main(String args[]) 
  {
	  System.out.println("Select a particular type of Student :"+'\n'+"		 1) Hosteller Student :"+'\n'+"		 2) DayScholer Student :");
	  
	  int choice=Integer.parseInt(sc.nextLine());
	  
	    switch(choice)
	    {
	    case 1:  System.out.println("You have selected Day Scholler!!!");
	                System.out.print("Enter Student Id :");	
	                int stuId=Integer.parseInt(sc.nextLine());
	                
	                System.out.print("Enter Student Name :");	
	                String name=sc.nextLine();
	                
	                System.out.print("Enter Exam Fees :");	
	                double examFee=Double.parseDouble(sc.nextLine());
	                
	                System.out.print("Enter Hostel Fee :");	
	                double hostelFee=Double.parseDouble(sc.nextLine());
	                
	                System.out.print("Enter your total Fees :");	
	                double payAmout=Double.parseDouble(sc.nextLine());
	                     
	                
	                Hosteller hos=new Hosteller(stuId, name, examFee, hostelFee);
	                
	    	         if(hos.payFee(payAmout)<0) {
	    	        	 System.out.println("Refundabale Amount is :"+hos.payFee(payAmout));
	    	         }else
	    	        	 System.out.println("Payable Amount is :"+hos.payFee(payAmout));
	    	       
	    	         System.out.println(hos);
	    break;
	    case 2: 
	    	System.out.println("You have selected Hosteller!!!");
            System.out.print("Enter Student Id :");	
             stuId=Integer.parseInt(sc.nextLine());
            
            System.out.print("Enter Student Name :");	
            name=sc.nextLine();
            
            System.out.print("Enter Exam Fees :");	
           examFee=Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter Transport Fee :");	
        double transportFee=Double.parseDouble(sc.nextLine());
            
            System.out.print("Enter your total Fees :");	
             payAmout=Double.parseDouble(sc.nextLine());
                 
                        DayScholar ds= new DayScholar(stuId, name, examFee, transportFee);
            
	         if(ds.payFee(payAmout)<0) {
	        	 System.out.println("Refundabale Amount is :"+ds.payFee(payAmout));
	         }else
	        	 System.out.println("Payable Amount is :"+ds.payFee(payAmout));
	       
	         System.out.println(ds);
	   break;
	    	default:      System.out.println("Invalid Option..");   
	    	         
	    }  
		  
		  
		  
		  
		  
		  
		  
  }
   
}
