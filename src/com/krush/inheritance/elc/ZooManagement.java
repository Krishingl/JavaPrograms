package com.krush.inheritance.elc;

import java.util.Scanner;

import com.krush.inheritance.blc.Animal;
import com.krush.inheritance.blc.Dog;
import com.krush.inheritance.blc.Mammal;

public class ZooManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = Integer.parseInt(scanner.nextLine());
         // Consume newline

        switch (choice) {
            case 1:
               
                String animalName = scanner.nextLine();
                Animal animal = new Animal(animalName);
                System.out.println(animal);
                break;
            case 2:
               
                String mammalName = scanner.nextLine();
               
                boolean hasFur = scanner.nextBoolean();
                Mammal mammal = new Mammal(mammalName, hasFur);
                System.out.println(mammal);
                break;
            case 3:
               
                String dogName = scanner.nextLine();
                boolean dogHasFur = scanner.nextBoolean();
                scanner.nextLine(); // Consume newline
               
                String breed = scanner.nextLine();
                Dog dog = new Dog(dogName, dogHasFur, breed);
                System.out.println(dog);
                break;

            default:
                System.out.println("Invalid choice.");
        }

        scanner.close();
    }
}