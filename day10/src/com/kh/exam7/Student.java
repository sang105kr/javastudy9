package com.kh.exam7;

public abstract class Student extends Person {
  public Student(){ 
    super();
    System.out.println("Student 생성자 호출");
  }
//  @Override
//  public void smile() {
//    System.out.println("웃다");
//  }
  public void study(){
    System.out.println("공부하다");
  }
}
