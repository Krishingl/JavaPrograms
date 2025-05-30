package com.krush.jvm_arch;

public class ReturunTypeOfLoadedClass {

	public static void main(String[] args) {
// I want find the return type of class Customer.class file  after the loaded method area.

		
		//java.lang.Class class its having once of the non static getName() , getClassLoader().
		//its give to us  Fully Qualified Name(FQA)[pakageNmae+className].
	//java.lang.Class its a predefine class.
//every class loaded in the method area then method area its return the java.lang.Class class Object.
	Class cls= Customer.class;//Coustomer.class its return the java.lang.Class class Object.
	
	
	System.out.println("Customer class FQA is: "+cls.getName());//com.krush.jvm_arch.Customer
	
     cls=Manager.class;
     
     System.out.println("Manager class FQA is: "+cls.getName());//com.krush.jvm_arch.Manager
	 
     //remember we will import the classes that time use the Fully Qualified Name.
		
		
   
		
		
	}

}

class Customer{}
class Manager{}
//two classes are user defined classes. 