package com.krush.mcqs;

//17. Write a java program can we create object without having non-static variable in the class?
class Test
{
void m1(){
System.out.println("m1() method");
}
public static void main(String[] args)
{
System.out.println("main method");
Test t=new Test();
t.m1();
}
}
/*op:==>
main method  
m1() method
*/