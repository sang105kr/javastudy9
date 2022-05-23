package com.kh.exam9;

import javax.swing.text.View;

public class VehicleDriver {
  public static void main(String[] args) {
    // 3,500 cc의 가격이 5,000 만원인 제네시스 승용차를 나타내는 Car 객체를 생성한다
    Car c1 = new Car("제네시스", 50_000_000, 3_500);

    // car1이 가리키는 객체의 모든 데이터를 출력한다
    System.out.println(c1);

    // car1이 가리키는 객체의 세금을 계산하여 출력한다
    System.out.println(c1.calculateTex());

    // 2,500 톤의 가격이 2,000 만원인 봉고 트럭을 나타내는 Truck 객체를 생성한다
    Truck t1 = new Truck("봉고", 20_000_000, 2_500);

    // truck이 가리키는 객체의 모든 데이터를 출력한다
    System.out.println(t1.toString());

    // truck이 가리키는 객체의 세금을 계산하여 출력한다
    System.out.println(t1.calculateTex());

    // 1,000 cc의 가격이 1,500 만원인 쏘울 승용차를 나타내는 Car 객체를 생성한다
    Car c2 = new Car("쏘울", 15_000_000, 1_000);

    // car2가 가리키는 객체의 모든 데이터를 출력한다
    System.out.println(c2);

    // car2가 가리키는 객체의 세금을 계산하여 출력한다
    System.out.println(c2.calculateTex());

    System.out.println("=========");
    Vehicle[] vehicles = new Vehicle[3];
    vehicles[0] = c1;
    vehicles[1] = t1;
    vehicles[2] = c2;

    for(int i=0; i<vehicles.length; i++){
      System.out.println(vehicles[i].calculateTex());
    }
  }
}
