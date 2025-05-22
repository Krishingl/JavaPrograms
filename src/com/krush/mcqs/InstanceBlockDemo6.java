package com.krush.mcqs;

//20. Find the Output of the Program.

class NIT
{
	public NIT()
	{
		System.out.println("Constructor");
		
		{
		  System.out.println("Non static block");	
		}
	}
}

public class InstanceBlockDemo6 
{

	public static void main(String[] args)
	{
		new NIT();

	}

}
/*
op==>
    Constructor
	Non static block
	*/