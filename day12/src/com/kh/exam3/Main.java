package com.kh.exam3;

public class Main {
  public static void main(String[] args) {
    System.out.println(HomeAppliances.voltage);

    HomeAppliances homeAppliances = new Radio();
    homeAppliances.on();
    homeAppliances.off();

    Radio radio= (Radio)homeAppliances;
    radio.matchChannel();
    
    //익명 클래스(인터페이스 구현 or 클래스 상속할때)
    //목적 : 1회성 인스턴스를 만들고 버림.
    //case1) 인터페이스 구현을 통한 익명클래스
    HomeAppliances h1 = new HomeAppliances(){
      public void on(){
        System.out.println("켜다");
      }
      public void off(){
        System.out.println("끄다");
      }
    };
    h1.on();
    h1.off();

    Radio r1 = new Radio(){
      @Override
      public void matchChannel() {
        listener();
        System.out.println("음성으로 주파수 마추다");
      }
      //음성인식
       void listener(){
        System.out.println("음성을 인식하다");
      }
    };

    r1.on();
    r1.matchChannel();
  }
}
