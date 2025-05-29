package com.krush.mcqs.inheritance;
//
//public class Output
//{
//    public static void main(String[] args)
//    {
//        new Alpha();  //
//        new Base();
//    }
//}
//
//class Alpha extends Base
//{
//    Alpha()
//    {    //Super();
//        System.out.print("Base");
//    }
//}
//
//class Base
//{  
//    Base()
//    {   //super();
//        System.out.println("Base");
//    }
//}



//
//public class Output
//{
//    public static void main(String [] args)
//    {
//        Count t = new Count();
//        t.count();
//    }
//}
//
//class Count extends Count2
//{
//    Count()
//    { //super();
//
//    }
//}
//class Count2
//{
//    void count()
//    {
//        System.out.print("Output = ");
//
//        for (int x = 0; x < 7; x++,x++ )
//        {
//            System.out.print(" " + x);
//        }
//    }
//}


//
//
//
//Q4) Find the Output
//
//What will be the output of the following program?
//
//class Output
//{
//    public static void main(String [] args)
//    {
//        Count2 count = new Count2();
//        count.count();
//    }
//}
//
//class Count extends Count2
//{
//    Count()
//    {
//
//    }
//}
//class Count2
//{
//    void count()
//    {
//        int i = 5;
//        System.out.print("Output = ");   
//
//        for (int x = 0; x <= (i % 7); x += 1)  // i%7 == 5 % 7 ==>5
//        {
//            System.out.print(" " + x);
//        }
//    }
//}
////Output =  0 1 2 3 4 5

//
//class Output
//{
//    public static void main(String [] args)
//    {
//        Count2 count = new Count2();
//        count.count();
//    }
//}
//
//class Count extends Count2
//{
//    Count()
//    {
//
//    }
//}
//class Count2
//{
//    void count()
//    {
//        int i = 5;
//        System.out.print("Output = ");
//
//        for (int x = 0; x <= (i % 7); x += 1)
//        {
//            System.out.print(" " + x);
//            i++;
//        }
//    }
//}
//
//



//Que-6)
//___________________
//What will be the output of the following program?
/*
public class Output
{
    public static void main(String s[])
    {
        int i = 2;
        B b = new B();
        b.execute();
    }
}

class A
{
    int i = 0;
    A(){}
}

class B extends A
{
    void execute()
    {
        for(; i < 6; i++)
        
            switch(i)
            {
                case 0:
                System.out.println("i is zero.");
                break;
        
                case 1:
                System.out.println("i is one.");
                break;
        
                case 2:
                System.out.println("i is two.");
                continue;
        
                case 3:
                System.out.println("i is three.");
                break;
        
                default:
                System.out.println("i is greater than three.");
            }
    }
}
*/
/*i is zero.
i is one.
i is two.
i is three.
i is greater than three.
i is greater than three.
*/





/*
//What will be the output of the following program?

class Output
{
    public static void main(String s[])
    {
        int i = 2;
        B b = new B();
        b.execute();
    }
}

class A
{
    A()
    {
        int i = 1;
    }
}

class B extends A
{
    void execute()
    {
        System.out.println("i = " + i);
    }
}
// compile time error
*/