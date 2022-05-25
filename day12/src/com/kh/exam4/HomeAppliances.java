package com.kh.exam4;
/*
  인터페이스 특징
  1. 멤버필드는 상수(static final)만 올수 있다.(static final 생략가능)
  2. 멤버메소드는 추상메소드가 온다. //메소드 선언부(호출이름,입력,출력)
  3. 모든멤버는 public (public키워드를 명시하지않아도 자동 public)
  4. 인스턴스를 만들수 없다. 하지만 타입으로는 사용가능(구현체를 대입해서)
  5. 인터페이스 구현은 다중 구현이 가능.
  6. 인터페이스 간의 상속은 단일 상속.

 */
public interface HomeAppliances {
  int voltage = 220;
  //전원을 켜다.
  abstract void on();
  //전원을 끄다.
  abstract public void off();
  //음성인식 하다.

  //default, static
  //1) java8버전에 등장
  //2) 목적 : 기존에 인터페이스를 구현하고 있던 구현체에 영향을 주지않고 기능 추가
  //3)      default : 구현클래스에서 재정의 가능
  //4)      static  :  인터페이스.메소드이름으로 사용할 수 있다.
  default void listenVoice(){
    System.out.println("음성 인식하다");
  };
  static void doInter(){
    System.out.println("인터넷 하다");
  }
}
