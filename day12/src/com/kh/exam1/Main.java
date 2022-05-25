package com.kh.exam1;

public class Main {
  public static void main(String[] args) {
    AirConditioner airConditioner = new AirConditioner();
    Tv tv = new Tv();
    Radio radio = new Radio();

    airConditioner.on();
    tv.turnOn();
    radio.powerOn();

  }
}
