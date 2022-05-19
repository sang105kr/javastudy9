package com.kh.exam1;

public class Calculator {

  private String color; //색상
  private String maker; //제조사

  private boolean power;
  private double result;  //결과값

  // 디폴트 생성자 : 매개변수가 정의되지 않은 생성자
  //               개발자가 명시하지 않으면 컴파일러가 자동 생성
  //               개발자가 명시적으로 생성자를 1개라도 정의하면 디폴트 생성자는 자동 생성(x)
//  public Calculator(){
//    super();
//  }
  public Calculator(String color){
    this.color = color;
  }
//
  public Calculator(String color, String maker){
    this.color = color;
    this.maker = maker;
  }

  //사칙연산
  public void plus(double x, double y) {
    if(this.power == false) {
      System.out.println("파워를 켜주세요!");
      return;
    }
    this.result = x + y;
  }

  public void minus(double x, double y) {
    if(this.power == false) {
      System.out.println("파워를 켜주세요!");
      return;
    }
    this.result = x - y;
  }

  //켜다
  public void powerOn(){
    this.power = true;
  }

  //끄다
  public void powerOff(){
    this.power = false;
  }

  //현재 파워 on , off 상태를 반환
  public boolean isPower(){
    return this.power;
  }

  public double getResult() throws Exception{
    // 파워가 꺼져있으면 예외를 발생.
    if(this.power == false){
      throw new Exception("파워가 꺼져있음!");
    }
    return this.result;
  }

  public String getColor(){
    return this.color;
  }

  public String getMaker(){
    return this.maker;
  }
}
