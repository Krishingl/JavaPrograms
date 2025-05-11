package com.krush.logical_programs;

import java.util.Scanner;

public class CheckStringIsPalindrome {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		
	    System.out.print("Enter the Your String : ");
	    
	    
	    String str=sc.nextLine();
	    
	    
	    char Chars[]=str.toCharArray();
	    
	    String revStr="";
	    
	    
	    for(int i = Chars.length-1 ; i>=0;i--) 
	    {
	    	revStr+=Chars[i];
	    }
	    
	    
	    
	    if(revStr==str) {
	    	System.out.println(str+" its Palindrome");
	    }else
	    	System.out.println(str+" its Not Palindrome");
		
	}

}
