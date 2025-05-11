/**
 Write a Java program to reverse a string(Sentence) without using built-in methods.
*/





package com.krush.logical_programs;

import java.util.Scanner;

public class ReverseGivenString {

	
	public static void main(String[] args)
	{
	       Scanner sc= new Scanner(System.in);
	      
	       System.out.print("Eneter the Sentence : ");
	       
	       String strs= sc.nextLine();
            
	       char ch[]= strs.toCharArray();
	       
	       
	       String rev="";
	       
	       for(int i=ch.length-1;i>=0;i--) 
	       {  
	    	   
	    	   
	    	   rev+=ch[i];
	       }
	       
	       System.out.println("Reverse String is : "+rev);
	      
	       
	       
	      sc.close(); 
	}
}
