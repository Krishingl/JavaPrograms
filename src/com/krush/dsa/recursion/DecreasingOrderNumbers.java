package com.krush.dsa.recursion;
/*Print numbers from n to 1(Decreasing Order)*/

public class DecreasingOrderNumbers
{
	public static void printDec(int n) 
	{
		if(n==1)
		{
			System.out.println(n);
			
			return;
		}
		System.out.println(n+" ");
		printDec(n-1);  //this function call itSelf.
	}
	
	
	
	
       public static void main(String[] args) 
       {
    	   
    	   int n=10;
    	   printDec(n);
		
	}
}

/*
Out_Put:-
10    //starting number 
9 
8 
7 
6 
5 
4 
3 
2 
1   //baseCase

 */

