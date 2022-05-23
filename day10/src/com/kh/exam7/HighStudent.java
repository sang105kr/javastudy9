package com.kh.exam7;

public class HighStudent extends Student{
  public HighStudent(){ 
    super();
    System.out.println("HighStudent 생성자 호출");
  }
  @Override
  public void smile() {
    System.out.println("하하 웃다");
  }
}
