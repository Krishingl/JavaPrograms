package com.krush.singleton_class.blc;

//Singleton class
public class Singleton {

 // Step 1: Create a private static instance of the class
 private static Singleton instance;

 // Step 2: Make the constructor private so that new objects can't be created
 private Singleton() {
     System.out.println("Singleton instance created!");
 }

 // Step 3: Create a public static method to get the instance
 public static Singleton getInstance() {
     if (instance == null) {
         instance = new Singleton(); // create instance if it doesn't exist
     }
     return instance; // return the same instance every time
 }

 
 // Sample method
 public void showMessage() {
     System.out.println("Hello from Singleton!");
 }

}
