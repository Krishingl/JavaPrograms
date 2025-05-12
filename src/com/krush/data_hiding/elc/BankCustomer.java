package com.krush.data_hiding.elc;
import com.krush.data_hiding.blc.Bank;
import java.util.Scanner;
public class BankCustomer 
{
         static Scanner sc=new Scanner(System.in);
	    public static void main(String[] args) 
        {
	    	
			Bank refBank=new Bank();  //Object created
			
			
			
			System.out.println("----------------Fill All Details Carefully----------------"+'\n');
			System.out.print("Enter your First Name : ");
			String cFName=sc.nextLine();  
			
			System.out.print("Enter your Last Name : ");
			String cLName=sc.nextLine();
			
			System.out.print("Enter your Address : ");
			String cAddres=sc.nextLine();
			
			System.out.print("Enter your Contact Number : ");
			long cContact=Long.parseLong(sc.nextLine());
			
			System.out.print("Enter your Aadhar Number : ");
		    long cAadhar=Long.parseLong(sc.nextLine());
		    
			System.out.print("Fixed Deposite 1000Rs Enter your amount : ");
			 double cBankBalance=Double.parseDouble(sc.nextLine());
			
			
			System.out.print("Enter your Enter careFully your banking pin : ");
			int cPinCode=Integer.parseInt(sc.next());
			
	    	
	    	refBank.setCustomerDetials(cFName, cLName, cAddres, cContact, cAadhar, cBankBalance, cPinCode);
	    	
	    	System.out.println("-------------------------------------------------------------------");
	    	
	    	System.out.println(refBank);
	    	
	    	
	    	refBank.deposite(10000);
	    	refBank.withdrow(2000);
	    	
	    	
		}
          
	    
	   
	    
	    
	    
}
