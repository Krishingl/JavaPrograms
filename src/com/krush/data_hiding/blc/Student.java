//
//ask: Create an encapsulated Student class in Java
//Requirements:
//
//Create a class named Student.
//
//It should have the following private fields:
//
//name (String)
//
//rollNo (int)
//
//Add public getter and setter methods for both fields.
//
//In the setter for rollNo, ensure the value cannot be negative. If it is, throw an IllegalArgumentException.
//

package com.krush.data_hiding.blc;

public class Student {
	
	   private String name;
	   private int rollNo;
	   
	   public Student(String name,int rollNo) 
	   {
		   this.name=name;
		   this.rollNo=rollNo;
		   
		  
	   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name.isEmpty()) {
			System.err.println("Error : name not be Null ");
			System.exit(0);
		}
		this.name = name;
	}

	public int getRollNo() {
		
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		if(rollNo<0) {
			System.err.println("Error : Invalid Roll No. ");
			System.exit(0);
		}
		this.rollNo = rollNo;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNo=" + rollNo + "]";
	}
	   
	
	
	   

}
