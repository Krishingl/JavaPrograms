package com.krush.mcqs.inheritance;
//
//public class ConstructorsTest {
//	  public static void main(String[] args)
//	    {
//	        U u = new U(); //U
//	        U u1 = new U(1); // u
//	        V v = new V(); //V
//	        V v1 = new V(1); //v
//	        T t = new T();
//	        T t1 = new T(1);
//	    }
//	}
//	class U {
//	    V v = new V();
//
//	    U() 
//	    { 
//	     System.out.print("U"); 
//	    }
//
//	    U(int i) 
//	    {
//	     System.out.print("u");
//	    }
//	}
//
//	class V
//	{
//	    V() 
//	    {
//	     System.out.print("V");
//	    }  
//
//	    V(int i)
//	    {   
//	     System.out.print("v"); 
//	    }
//	}
//
//	class T extends V 
//	{
//	    T() 
//	    {
//	     System.out.print("T"); 
//	    }
//
//	    T(int i) 
//	    {
//	     System.out.print("t"); 
//	    }
//}
//
//class ConstructorsTest {
//    public static void main(String[] args) {
//        new A(3);  
//        new B(5, 6);
//        new B(6, 7).C(1, 2, 3);
//        new C(3, 3, 4).B(4, 5);
//        new C(1, 1, 1);
//      //6 10 24 12 28 3 6 12 1 24 2 4 -2 
//    }
//}
//class A {
//    A(int i) {  
//  print(i * 2);   
//     }
//    void print(int i) { 
//    System.out.print(i + " ");   
//    }
//}
//class B extends A {
//    B(int j, int k) {
//        super(j);
//        print(k * 4);
//    }
//    void C(int j, int k, int l) {
//      print(j + k + l - 3);   
//       }
//}
//class C extends B {
//    C(int j, int k, int l) {
//        super(j, k);
//        print(l - 3);
//    }
//    void B(int i, int k) {  
//      print(i * 6);   
//      }
//}
//Que-9)
//________________
//What will be the output of the following program?

/*
class ConstructorsTest
{
    public static void main(String[] args)
    {
        new Car(0);
    }
}

class Vehicle
{
    int i;
    int j;

    Vehicle(int i)
    {
        this.i = i;
        j = i;
    }

    Vehicle(int i, int j)
    {
        this.i = i;
        this.j = j;
    }
}

class Bus extends Vehicle
{
    double j;

    Bus(double j)
    {
        this.j = j;
    }
}

class Car extends Vehicle
{
    Car(int i)
    {
        super(i);
        System.out.print("Executed Successfully");
    }
}
Error here super(); missing on Buss Class
*/



