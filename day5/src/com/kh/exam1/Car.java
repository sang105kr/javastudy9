package com.kh.exam1;

//개념을 정의하고 정의된 개념에 이름을 붙임.
public class Car {
  // 인스턴스 멤버 필드  : 객체의 상태,정보를 표현
  String color;  //색상
  String cc;     //배기량
  String maker;  //메이커

  // 생성자 메소드 : 객체 생성시 초기화
  public Car(String color, String cc, String maker) {
    this.color = color;
    this.cc = cc;
    this.maker = maker;
  }
  
  // 인스턴스 멤버 메소드 : 객체의 행위,동작
  public void start(){
    System.out.println(this.color +" 출발하다");
  }
  public void run(){
    System.out.println(this.color + " 주행하다");
  }
  public void stop(){
    System.out.println(this.color + " 멈추다");
  }
}
