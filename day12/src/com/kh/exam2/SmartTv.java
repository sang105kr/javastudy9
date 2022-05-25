package com.kh.exam2;

public class SmartTv extends Tv implements SmartInternet{
  @Override
  public void on() {
    System.out.println("스마트 TV를 켜다");
  }

  @Override
  public void off() {
    System.out.println("스마트 TV를 끄다");
  }
//
//  @Override
//  public String search(String keyword) {
//    return keyword;
//  }

  @Override
  public void listenVoice() {
    System.out.println("스마트 Tv가 음성을 인식하다");
  }
}
