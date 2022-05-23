package com.kh.exam4;

public class Student extends Person{
  private int studentId;  //학번

  public Student(){super();}

  public void study(){
    System.out.println("공부하다");
  }

  @Override
  public void eat(){
    System.out.println("많이 먹다");
  }
}
