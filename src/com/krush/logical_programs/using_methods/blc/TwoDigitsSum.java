package com.krush.logical_programs.using_methods.blc;

public class TwoDigitsSum {
	
public static int	getSumOfDigits(int n)

{    if(n<0) {
	return -3;
}else if(n>99) {
	  return -2;
}else  if(n>=0&&n<=9) { 
	return -1;
}else {
	
	
	int sum=0;
	    while(n!=0) {
	    	
	    	sum+=n%10;
	    	n/=10;
	    }
	    return sum;
		
	}
}

}
