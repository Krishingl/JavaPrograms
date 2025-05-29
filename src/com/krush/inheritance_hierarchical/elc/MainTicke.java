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
