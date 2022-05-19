package com.kh.exam3;

public class Car {
  private int id;           //자동차 고유 식별번호
  private static int count; //자동차 식별번호 부여
  private String color;

  public Car(String color) {
    this.color = color;
    id = ++count;
  }
  public String getColor() {
    return color;
  }
  public void setColor(String color) {
    this.color = color;
  }
  @Override
  public String toString() {
    return this.color;
  }
  public int getId() {
    return id;
  }

//  public static int getCount() {
//    return count;
//  }
}
