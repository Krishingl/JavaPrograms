package com.krush.mcqs.inheritance;


//Que-10)

//What will be the output of the following program?

class BaseClass {
  BaseClass() {
      System.out.print("*");
  }
  BaseClass(String str) {
      this();
      System.out.print("@" + str);
  }
}
public class ChildClas extends BaseClass {
  ChildClas() {
      System.out.print("#");
  }
  ChildClas(String name) {
      this();
      System.out.print("$" + name);
  }
  public static void main(String args[]) {
      new ChildClas("hello");
  }
}