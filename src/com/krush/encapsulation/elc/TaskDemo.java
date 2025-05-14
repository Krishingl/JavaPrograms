/**
 * Assignment 02 :
---------------
You are developing a task management application that allows users to create and manage their tasks efficiently. 

Create a BLC class Task.

Attributes :[Access modifier private]
-------------------------------------
name			data type
-------			------------
title			:String
description	        :String
priority		:String

Acess modifier : private(for all variables)

Parameterized Constructor: Initialize the task object all properties.

Methods:
Case 1 :
[Return type of below methods is void and acess modifier is public]

updateDescription(String newDescription): This method should update the description of the task.

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
Error message indicating invalid description
 * */







package com.krush.encapsulation.elc;
import java.util.Scanner;
import com.krush.encapsulation.blc.Task;
public class TaskDemo
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Do Task Application is Created ");
		
		System.out.print("Task Title : ");
		
		String tTitle=sc.nextLine();
		
        System.out.print("Task Description : ");
		
		String tDescrip=sc.nextLine();
		
        System.out.print("Task Priority : ");
		
		String tPriority=sc.nextLine();
		
		 System.out.print("Is Task Completed? ");
			
	      boolean isCompleted=sc.nextBoolean();
			
		Task tx=new Task(tTitle, tDescrip, tPriority, isCompleted);
		
		
		
		
		System.out.println("You want to Update your task [yes/no] ");
		
		String up=sc.next();
		
		if(up.equalsIgnoreCase("yes")) {
			
			System.out.print("Enter Updated Task Title : ");
			sc.nextLine();
			tTitle=sc.nextLine();
			
			tx.updateTitle(tTitle);
			
			System.out.print("Enter Updated Task Description : ");
			
			 tDescrip=sc.nextLine();
			 
			 tx.updateDescription( tDescrip);
			 
			 
			  System.out.print("Enter Updated Task Priority : ");
				
				 tPriority=sc.nextLine();
				 
				 tx.updatePriority( tPriority );
				 
				 
			      
		}
		
		System.out.println("-------------------------------------------------------------");
		
		System.out.println("Task Title : "+tx.getTitle());
		System.out.println("Task Description : "+tx.getDescription());
		System.out.println("Task Priority : "+tx.getPriority());
		System.out.println("Task is Completed ? : "+tx.isCompleted());
		
		
		
		sc.close();
	}

}
