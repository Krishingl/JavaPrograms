package com.krush.inheritance_multilevel.elc;

import java.util.Scanner;

import com.krush.inheritance_multilevel.blc.Animal;
import com.krush.inheritance_multilevel.blc.Dog;
import com.krush.inheritance_multilevel.blc.Mammal;
public class MultilevelInheritance
{     

    public static void main(String args[]){
   Scanner sc= new Scanner(System.in);
    int choice = Integer.parseInt(sc.nextLine());

    switch(choice){

                 case 1:  Animal am = new Animal();
                 am.eat();

                 break;
                 case 2:  Mammal mm = new Mammal();
                 mm.walk();
                 break;
                 case 3:  Dog dg = new Dog();
                 dg.bark();
                 break;
                default : System.out.print("Invalid choice!");
    }
    }      
}