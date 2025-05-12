package com.krush.data_hiding.blc;
import java.util.Scanner;
public class Bank {
	Scanner sc=new Scanner(System.in);
	  //bank Static properties
	  static String bankName="State Bank Of India";
	  static String bankAddress="At Shegaon, Maharashtra";
      final static String BANK_IFSC_CODE="SBI0000008";
       
      //customer private non static details
      
      //data hiding all are customer sensitive  data we want to make private
      
      private String customerFirstName="null";
      private String customerLastName="null";
      private String customerAddress="null";
      private long   customerContact=0L;
      private long customerAadhar=0L;
      private long customerAcNumber=0000000000L;
      private double  customerBankBalance=1000; //minimum deposit balance 
      private int pinCode=000000;
      
      
      public  void setCustomerDetials(String customerFirstName,String customerLastName,String customerAddress,long customerContact, long customerAddhar,double customerBankBalance,int pinCode) {
    	  //data Validation
    	  if(customerBankBalance<=999 || customerFirstName=="null" || customerLastName=="nill" || customerAddhar==0L || customerContact ==0L) {
    		  
    		  System.err.println("Fill the all fields, Minimum Deposit 1000.Rs ");
    	  }else {
    	  
    	       this.customerFirstName=customerFirstName;
    	       this.customerLastName=customerLastName;
    	       this.customerAddress=customerAddress;
    	       this.customerContact=customerContact;
    	       this.customerAadhar=customerAddhar;
    	       this.customerBankBalance=customerBankBalance;
    	      customerAcNumber+=1L;
    	      this.pinCode=pinCode;
    	       
    	       
    	       
    	  }  
    	  
    	  
    	  
    	  
    	  
      }


	@Override
	public String toString() {
		
		return "Bank [customerFirstName=" + customerFirstName + ", customerLastName=" + customerLastName
				+ ", customerAddress=" + customerAddress + ", customerContact=" + customerContact + ", customerAadhar="
				+ customerAadhar + ", customerBankBalance=" + customerBankBalance +",AcountNumber= "+ customerAcNumber +"]";
	}
	
	
	
	public void deposite(double deposite){
		      
		if(deposite>=0) {
			
			customerBankBalance+=deposite;
			
			
			System.out.println("Succesfully Deposite "+deposite+".Rs");
			
		}else System.err.println("Enter the valid Ammount : ");
		
		
		
	}
	public void withdrow(double withdrow){
	      
		if(withdrow <=customerBankBalance-1000)
		{
			System.out.print("Enter the Pin code : ");
			
			if(pinCode==sc.nextInt())
			{
			customerBankBalance-=withdrow;
			System.out.println("Succesfully Deposite "+withdrow+".Rs");
			}else System.err.println("Enter a valid pin ");
		
			
		}else System.err.println("Insuffitiant Balance ");
		
		
		
	}
	
	
	

}
