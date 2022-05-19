package com.kh.exam3;

public class CarMain {
  public static void main(String[] args) {
    Car c1 = new Car("white");
    Car c2 = new Car("red");
    Car c3 = new Car("black");

    System.out.println(c1.getId());
    System.out.println(c2.getId());
    System.out.println(c3.getId());

//    System.out.println(Car.getCount());

  }
}
