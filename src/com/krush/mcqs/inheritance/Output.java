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

class Output
{
    public static void main(String [] args)
    {
        Count2 count = new Count2();
        count.count();
    }
}

class Count extends Count2
{
    Count()
    {

    }
}
class Count2
{
    void count()
    {
        int i = 5;
        System.out.print("Output = ");

        for (int x = 0; x <= (i % 7); x += 1)
        {
            System.out.print(" " + x);
        }
    }
}