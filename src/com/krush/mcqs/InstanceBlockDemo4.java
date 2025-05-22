package com.krush.mcqs;


//19. Find the Output and Check How many times NSB will be executed. 

class Foo
{
	public Foo(int x, int y)
	{
		this(2.4, 5.7);
		System.out.println("Integer parameter constructor");
	}
	public Foo(double x, double y)
	{    //here non-static block executed
		System.out.println("Double parameter constructor");
	}
	
	{
		System.out.println("Non static block");
	}
	
}

public class InstanceBlockDemo4 {

	public static void main(String[] args) 
	{
		Foo f1 = new Foo(100,200);

	}

}
/*  op==>
     Non static block
    Double parameter constructor
	Integer parameter constructor
	*/
// non-static block executed only one time in double parameter constructor only.