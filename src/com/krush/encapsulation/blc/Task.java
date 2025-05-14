package com.krush.encapsulation.blc;

public class Task 
{
	private  String title;
	private String description;
	private String  priority;
	private boolean isCompleted;

	
	public Task(String title, String description, String priority, boolean isCompleted) {
		super();
		if(title.isEmpty()) {
			System.err.println("Error message indicating invalid title.");
			System.exit(0);
		}
		this.title = title;
		this.description = description;
		this.priority = priority;
		this.isCompleted = isCompleted;
	}
	public void updateTitle(String newTitle) {
		if(title.isEmpty()) {
			System.err.println("Error message indicating invalid title.");
			System.exit(0);
		}
		this.title=newTitle;
		
	}

	public void updateDescription(String newDescription) {
		
		
		this.description=newDescription;
		
	}
	
	public void updatePriority(String newPriority) {
		  
		this.priority=newPriority;
		
	}
	
	public void markCompleted() {
		this.isCompleted=true;
		
	}
	
	public String getTitle(){
		
		return this.title;
	}
	
    public String getPriority(){
		
		return this.priority;
	}
     public String getDescription()
     {
    	 return this.description;
     }
      
     
     public boolean isCompleted() {
    	 return  this.isCompleted;
     }
}


/**
  



Parameterized Constructor: Initialize the task object all properties.



updatePriority(String newPriority): This method should update the priority level of the task.

markAsCompleted(): This method should mark the task as completed.

Methods:
Case 2 :
[Return type of below method should be non void and acess modifier is public]

getTitle(): This method should return the title of the task.

getDescription(): This method should return the description of the task.

getPriority(): This method should return the priority level of the task.

isCompleted(): This method should return true if the task is completed, and false otherwise.


Create another class main which is having main method and instantiate the task object and execute the method.

Test Cases :

case -1
---------
Task Title: Finish Project
Task Description: Complete documentation
Task Priority: High
Is Task Completed? false


case-2
---------
Title: ""
Description: "Complete documentation"
Priority: "High"

Expected Output: 
Error message indicating invalid title.[use isEmpty() to validate String]

case-3
--------
Title: "Finish Project"
Description: ""
Priority: "High"

Expected Output: 
Error message indicating invalid description*/
