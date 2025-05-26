package com.krush.mcqs.inheritance;

public class Inheritance {
/*
 Q1) Find the output :

class Parent 
{      //default constructor add by javac 
    public void show() 
    { 
      System.out.println("Parent");
    }
}
class Child extends Parent 
{   //default constructor add by javac 
    public void show() 
    { 
       System.out.println("Child"); 
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Child obj = new Child();
        obj.show();  //method overrinding
		
    }
}
//output:---> Child
Q2) Find the output of the Program

class Parent 
{   //default constructor add by javac
   protected int num = 100;
}
class Child extends Parent 
{    //default constructor add by javac
    protected int num = 200; //variable hidding  
}
public class Test 
{
   public static void main(String[] args) 
   {
        Child obj = new Child();
        System.out.println(obj.num);
    }
}
// output ==> 200
Q3) 

If class B extends class A, what can class B access from class A?
a) Only public members
b) public and protected members  //ans
c) private members
d) All members regardless of access modifiers

Q4) Find the output of the Program

class A 
{
    A() 
    {    // super() --added by javac. here its call the object class constructor
        System.out.println("Class A Constructor");  //first output;
    }
}
class B extends A 
{
    B() 
    {  // super() --added by javac. here its call the parent class default constructor.
        System.out.println("Class B Constructor");  //second output.
    }
}
public class Test 
{
    public static void main(String[] args) 
    {
        B obj = new B();
    }
}
//==> first object class memory allocated second A class memory allocated then after b(child class) memory alocated.


// output==> 
// Class A Constructor 
// Class B constructor
Q5) Find the output of the Program

class A 
{
    A(int x)
    {  
	// compiler add here super();
        System.out.println("Class A: " + x);  // first output
    }
}
class B extends A 
{
    B() 
    {
        super(10);   // compiler not add super of becuase here user added own parameter constructor in parent class.
        System.out.println("Class B");  //second output
    }
}
public class Test 
{
    public static void main(String[] args)
    {
        B obj = new B();
    }
}

Q6) Find the output of the Program

class Parent 
{
    Parent()  
    {
        System.out.println("Parent Constructor");  //first output
    }
}
class Child extends Parent
{
    Child()  
    {
        this(10);  // its call the current class parameter constructor. 
        System.out.println("Child Constructor");
    }
    Child(int x)          // constructor overloding
    {
        super();  // it call the parent class no argument constructor
        System.out.println("Child Constructor with x: " + x);
    }
}
public class Main 
{
    public static void main(String[] args)
    {
        Child obj = new Child(); // call no argument constructor.
    }
}

//Parent Constructor
//Child Constructor with x: 10
//Child Constructor

Q7) Which of the following is NOT true about constructor chaining?

a) A constructor can call another constructor of the same class using this()
b) A constructor can call a superclass constructor using super()
c) this() and super() can be used together in the same constructor   // ANS
d) Constructor chaining helps in code reusability


Q8) Which of the following is true about super() and this()?
a) Both must be the first statement in a constructor //Ans
b) Both can be used together in a constructor
c) this() calls the constructor of the same class, and super() calls the superclass constructor //Ans
d) Both can be used outside constructors


Q9) Find the output of the following code
class Parent 
{
       //compiler add default constructor and as first line super() Second line non-static block added if availabel .
    { 
    System.out.println("Parent Non-Static Block");
    }
}

class Child extends Parent 
{   
     //compiler add default constructor and as first line super() Second line non-static block added if availabel .


    { 
    System.out.println("Child Non-Static Block");
    }
}

public class Test 
{
    public static void main(String[] args) 
    {
        Child obj = new Child();
    }
}
//Parent Non-Static Block
//Child Non-Static Block

Q10) Find the output of the following code

class Alpha
{
    { 
    System.out.println("Block 1");  //first output
    }
    { 
    System.out.println("Block 2"); // second output
    }
    
    Alpha() 
    {   //super() added by javac 
	    // all non-static block exicute here. (top to down order non-static block executed.)
        System.out.println("Alpha Constructor");//third output
    }
}

class Beta extends Alpha
{
    { 
    System.out.println("Block 11");  //fourth output
    }
    { 
    System.out.println("Block 22"); //fifth output
    }
    
    Beta() 
    {   //super() added by javac 
	    // all non-static block exicute here.
        System.out.println("Beta Constructor"); //sixth output
    }
}

public class Test 
{
    public static void main(String[] args) {
        new Beta(); //nameless object or anonymous object.
    }
}

Q11) Find the output of the following code 
//Multi-level inheritance
class Grandparent 
{ 

     //comiler add defualt constructor. super() as first line.
	 
 public void print() 
 {
     System.out.println("Grandparent");  
 }
}

class Parent extends Grandparent 
{

        //comiler add defualt constructor. super() as first line.
 public void print() 
 {
     System.out.println("Parent");
 }
}

class Child extends Parent 
{ 

    //comiler add defualt constructor. super() as first line.
 public void Print() 
 {
     super.super.print();   //grandparent
     System.out.println("Child"); //child
 }
}

public class Test 
{
 public static void main(String[] args) {
     Child c = new Child();   
     c.Print();
 }
}
// above Program based on the method overrinding.
// output>> 
// grandparent
// child
Q12)
What is a blank final variable in Java?

A) A non static final variable with user initialized value. 
B) A non static final variable that is not initialized at declaration but must be initialized till constructor body.  //ans
C) A final variable that can be modified inside a method.
D) A static final variable.

Q13) What happens if a blank final field is not initialized in all constructors?
A) The program runs normally
B) It is initialized with a default value
C) A compile-time error occurs //ans
D) It is initialized when accessed for the first time



Q14) Find the Output of the following code

class A 
{
    final int num;  //blank final field
    
    A()
    {   //compiler added here super();
        num = 100;
    }
}
class B extends A 
{
    B() 
    {  //compiler added here super();
        num = 200;  
    	System.out.println(num);
    }
}   //Here we initialized final variable two times at time object creation. that resion it shows compile-time error

public class Test 
{
 public static void main(String[] args) {
    new B();  //nameless object or anonymous object 
 }
}
//Here we initialized final variable two times at time object creation. that resion it shows compile-time error
Q15) Find the output of the Program

class Parent 
{
    final int x;
    Parent() 
    {
        x = 10;
    }
}

class Child extends Parent {
    Child() 
    {
        System.out.println(x);
    }
    
    public static void main(String[] args) 
    {
        new Child();  // nameless object 
    }
}
// op is 10
Q16) Find the output of this program

class Vehicle
{
	protected String name; //Nexon

	public Vehicle(String name)  //Nexon
	{
		super();  // Object calss constructor call
		this.name = name;  //Nexon
	}
	
	public String printVehicleName()
	{
		return "Vehicle is Running";
	}
	
}
class Car extends Vehicle
{
	public Car(String name) //Naxon 
	{
		super(name); //parent class parameterized constructor call		
	}
	
	public String printVehicleName()
	{
		return "Car is Running";
	}
}


public class Test 
{
 public static void main(String[] args) 
 {
    Car c1 = new Car("Naxon");
    String name = c1.printVehicleName();
    System.out.println(name); //Car is Running
 }
}
output==> Car is Running

Q17) Find the output of this program [Help u to know method calling]

class Base
{
   int value=0;
   public Base()
   {   //comiler added super();
      addValue();
   }
   void addValue()
   {
      value += 10;
   }
   int getValue()
   {
      return value;
   }
}
class Derived extends Base
{
      public Derived()
      {  //comiler added super();
       addValue();
      }
      void addValue()
      {
        super.addValue();
        value +=  30;
      }
    }
    public class Test5 
    {
      public static void main(String[] args)
      {
          Derived b = new Derived();  		  
          System.out.println(b.getValue());
      }
    }
==> op is 80
Q18) Find the output 

class Foo 
{ 
 public int a = 3; //7 
 public void addFive() 
    {
	 a += 5;   
	 System.out.print("f "); // first output
	 }  
 } 
 class Bar extends Foo 
{ 
 public int a = 8; //13
 public void addFive() 
 {
 this.a += 5; 
 System.out.print("b " ); 
 } 
 }  
class Test 
{
	public static void main(String[] args) 
	{
		 Foo f = new Foo(); 
		 f.addFive();  //f 
		 System.out.println(f.a);// 7
		 
		 System.out.println("............");
		 Bar b = new Bar();
		 b.addFive(); //b
		 System.out.println(b.a); //13
		 
	}
}

Q19) Find the Output

class Grandparent 
{
    String name = "grandparent";
    void act() 
    {
        System.out.println(name);
    }
}

class Parent extends Grandparent 
{
    String name = "parent";
}

class Child extends Parent 
{
    String name = "child";
    
}

public class Test 
{
   public static void main(String[] args) 
   {
        Child yo = new Child();
        yo.act();  //grandparent
    }
}

Q20) Find the Output

class Grandparent 
{
    String name = "grandparent";
    void act() 
    {
        System.out.println(name);
    }
}

class Parent extends Grandparent 
{
    String name = "parent";
    
    void act() 
    {
        System.out.println(name);
    }
}

class Child extends Parent 
{
    String name = "child";
    
}

public class Test 
{
   public static void main(String[] args) 
   {
        Child yo = new Child();
        yo.act();  //parent
    }
}

 */
}
