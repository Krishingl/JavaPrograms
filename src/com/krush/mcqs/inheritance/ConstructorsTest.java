package com.krush.mcqs.inheritance;

public class ConstructorsTest {
	  public static void main(String[] args)
	    {
	        U u = new U(); //U
	        U u1 = new U(1); // u
	        V v = new V(); //V
	        V v1 = new V(1); //v
	        T t = new T();
	        T t1 = new T(1);
	    }
	}
	class U {
	    V v = new V();

	    U() 
	    { 
	     System.out.print("U"); 
	    }

	    U(int i) 
	    {
	     System.out.print("u");
	    }
	}

	class V
	{
	    V() 
	    {
	     System.out.print("V");
	    }

	    V(int i)
	    {   
	     System.out.print("v"); 
	    }
	}

	class T extends V 
	{
	    T() 
	    {
	     System.out.print("T"); 
	    }

	    T(int i) 
	    {
	     System.out.print("t"); 
	    }
}
