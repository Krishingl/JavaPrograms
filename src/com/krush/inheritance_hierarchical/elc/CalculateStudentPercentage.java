package com.krush.inheritance_hierarchical.elc;
import com.krush.inheritance_hierarchical.blc.*;
public class CalculateStudentPercentage {
    
	
	public static void main(String args[])
	{
		 ScienceStudent scienceStudent = new ScienceStudent("Anjali", 101, 85, 90, 80);
        ArtsStudent artsStudent = new ArtsStudent("Aryan", 102, 75, 80, 85);
        
        scienceStudent.displayDetails();
        System.out.println("Percentage: "+scienceStudent.calculatePercentage()+"%");
       // scienceStudent.calculatePercentage();
        
        
        
       System.out.println("---------------------------------------------");
                artsStudent.displayDetails();
           //     artsStudent.calculatePercentage();
                System.out.println("Percentage: "+ artsStudent.calculatePercentage()+"%");
	}
}
