package com.krush.mcqs;

//class Example
//{
//int x=10;
//int y=20;
//public static void main(String[] args)
//{
//Example e1=new Example();
//Example e2=new Example();
//System.out.println(e1.x+" ..."+e1.y); //10 ...20
//System.out.println(e2.x+" ..."+e2.y);  //20 ...20
//}
//}

class Example
{
int a=10;
int b=20;
public static void main(String[] args)
{
Example e1=new Example();
Example e2=new Example();
System.out.println(e1.a+". .."+e1.b); //10. ..20
System.out.println(e2.a+". .."+e2.b); //10. ..20
e1.a=50;
e2.b=60;
System.out.println(e2.a+". .."+e2.b);  //10. ..60
System.out.println(e2.a+". .."+e2.b);  //10. ..60
}
}