package com.kh.exam4;

public class Teacher extends Person{
  private int teacherId; //교직원 번호
  public Teacher(){super();}
  public void teach(){
    System.out.println("가르치다");
  }
}
