package com.krush.inheritance_hierarchical.elc;

import com.krush.inheritance_hierarchical.blc.StudentTicket;
import com.krush.inheritance_hierarchical.blc.Ticket;
import com.krush.inheritance_hierarchical.blc.VIPTicket;

public class MainTicke {

	public static void main(String args[]) {
		

        Ticket regularTicket = new Ticket("Concert", 101, 50.0);
		
        System.out.println(" Regular Ticket:");
        System.out.println();
        
        System.out.println("Event: "+regularTicket.getEventName());

        System.out.println("Seat Number: "+regularTicket.getSeatNumber());
        
        System.out.println("Seat Number:  $"+regularTicket.getPrice());
        
        VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
        System.out.println("--------------------------------------------------------------");

 System.out.println("VIP Ticket:");
        
 System.out.println();
        System.out.println("Event: "+ vipTicket.getEventName());

        System.out.println("Seat Number: "+ vipTicket.getSeatNumber());
        
        System.out.println("Seat Number:  $"+ vipTicket.getPrice());
        
        System.out.println("Special Access: "+ vipTicket.getSpecialAccess());
       
        StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);

        System.out.println("--------------------------------------------------------------");
System.out.println("VIP Ticket:");
System.out.println();
        
        System.out.println("Event: "+ studentTicket.getEventName());

        System.out.println("Seat Number: "+ studentTicket.getSeatNumber());
        
        System.out.println("Seat Number:  $"+studentTicket.getPrice());
        
        System.out.println("Special Access: "+ studentTicket.isStudentDiscount());
        


	}
}

/*
 
Que 2 : Ticket Management System with VIP and Student Tickets
============================================================= 

You have been hired by an event management company to develop a ticketing system that can manage different types of tickets for various events. 
The system needs to handle regular tickets, VIP tickets with special access privileges, and student tickets that may have a discount. 
Your task is to create a Java program with the following requirements: 

Design a Ticket class with attributes like event name, seat number, and price.

1.Create a class Ticket
------------------------

Instance variable:-

String eventName,private

int seatNumber,private

double price,private

Create a parameterized constructor for all Instance variable to initialize the variable.

Generate Getters and setters for all Instance variable to get values and set values.


2.Create another class VIPTicket and inherit Ticket class here.
---------------------------------------------------------------

Instance variable:-

String specialAccess,private

Create a parameterized constructor for Instance variable to initialize the variable.

//Use super keyword to initialize Ticket class constructor attributes.

Generate Getters and setters for Instance variable to get values and set values.


3.Create another class StudentTicket and inherit Ticket class here.
-------------------------------------------------------------------

Instance variable:-

boolean studentDiscount,private

Create a parameterized constructor for Instance variable to initialize the variable.

//Use super keyword to initialize Ticket class constructor attributes.

Generate Getters and setters for Instance variable to get values and set values.

Create a class MainTicket which contains main method to demonstrate the usage.

//Creating a Ticket object using the parameterized constructor

//Creating a VIPTicket object using the parameterized constructor

//Creating a StudentTicket object using the parameterized constructor


Condition :
-----------
if any numeric value is zero or negative then print "Error Invalid Input".


TEST CASE 1 :
-------------
sample input  : When your reading values for Ticket class OR VIPTicket OR StudentTicket then make sure if any numeric value is <=0 then print "Error Invalid Input".
                
sample output : Error Invalid Input



TEST CASE 2 :
-------------
sample input  : 
                  Ticket regularTicket = new Ticket("Concert", 101, 50.0);
                  VIPTicket vipTicket = new VIPTicket("VIP Concert", 201, 100.0, "Backstage Access");
                  StudentTicket studentTicket = new StudentTicket("Student Event", 301, 30.0, true);

sample output : 
                Regular Ticket:
                Event: Concert
                Seat Number: 101
                Price: $50.0
                
                VIP Ticket:
                Event: VIP Concert
                Seat Number: 201
                Price: $100.0
                Special Access: Backstage Access
                
                Student Ticket:
                Event: Student Event
                Seat Number: 301
                Price: $30.0
                Student Discount: true

 */
