package com.kh.exam3;

public class Radio implements HomeAppliances {
  @Override
  public void on() {
    System.out.println("라디오를 켜다");
  }

  @Override
  public void off() {
    System.out.println("라디오를 끄다");
  }

  //주파수를 맞추다
  public void matchChannel(){
    System.out.println("주파수를 맞추다.");
  }
}
