package com.krush.mcqs;

//18. Find the output of the Program.

class Demo
{
    Demo() 
    { 
    this(10); 
    System.out.println("No Argument Constructor");
    }
    Demo(int x) 
    { 
     System.out.println("Parameterized Constructor: " + x); 
    }    
    public static void main(String[] args) 
    {
        Demo obj = new Demo();
    }
}
/*
output:--->
      Parameterized Constructor: 10
	  No Argument Constructor
*/