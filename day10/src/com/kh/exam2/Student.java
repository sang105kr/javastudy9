package com.kh.exam2;

public class Student extends Person{
  {
    System.out.println("4");
  }
  static {
    System.out.println("7");
  }
  public Student(){
    //System.out.println("1");
    super();
    System.out.println("2");
  }
}
