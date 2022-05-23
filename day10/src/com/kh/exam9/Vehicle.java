package com.kh.exam9;
//public(어디든) > protected(동일패키지+다른패키지(단 하위개념)) > default(동일패키지) > private(클래스내)
public abstract class Vehicle {
  // 차량의 모델명과 가격에 대한 객체 변수를 선언한다
  protected String model;
  protected int price;

  // 차량의 모델명과 가격을 주어진 값으로 초기화하면서
  // 객체를 생성한다
  public Vehicle(String model, int price) {
    super();
    this.model = model;
    this.price = price;
  }

  // 차량의 모델을 반환한다
  public String getModel() {
    return model;
  }

  // 차량의 가격을 반환한다
  public int getPrice() {
    return price;
  }

  // 차량의 모델명과 가격을 반환한다
  @Override
  public String toString() {
    return "모델명 : " + model + ", 가격 : " + price;
  }

  // 차량의 세금을 계산한다
  abstract double calculateTex();

  // 차량의 모델을 주어진 값으로 변경한다
  public void setModel(String model) {
    this.model = model;
  }

  // 차량의 가격을 주어진 값으로 변경한다
  public void setPrice(int price) {
    this.price = price;
  }
}
