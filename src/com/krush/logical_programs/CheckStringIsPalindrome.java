package com.krush.logical_programs;

import java.util.Scanner;

public class CheckStringIsPalindrome {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
	    System.out.print("Enter the Your String : ");
	    
	    
	    String str=sc.nextLine();
	    
	    
	    char chars[]=str.toCharArray();
	    
	    String revStr="";
	    
	    
	    for(int i = chars.length-1 ; i>=0;i--) 
	    {
	    	revStr+=chars[i];
	    }
	    
	    char revChars[]=revStr.toCharArray();
	    
	
	    
	    boolean flag=true;
	    
	    	for(int i=chars.length-1;i>=0;i--) {
	    		if(chars[i]==revChars[i]) {
	    			
	    		}else flag=false;
	    	}
	    	  
	    	
	    	
	    	
	    System.out.println(str+" "+(flag==true?"its  palindrome":"its not palindrome "));
	    
	    
	  
	    
	}

}
