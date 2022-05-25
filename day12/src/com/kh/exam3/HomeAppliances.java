package com.kh.exam3;
/*
  인터페이스 특징
  1. 멤버필드는 상수(static final)만 올수 있다.(static final 생략가능)
  2. 멤버메소드는 추상메소드가 온다. //메소드 선언부(호출이름,입력,출력)
  3. 모든멤버는 public (public키워드를 명시하지않아도 자동 public)
  4. 인스턴스를 만들수 없다. 하지만 타입으로는 사용가능(구현체를 대입해서)
  5. 인터페이스 구현은 다중 구현이 가능.
  6. 인터페이스 간의 상속은 단일 상속.
  7. 인테페이스는 생성자 메소드가 없다.

 */
public interface HomeAppliances {
  int voltage = 220;   // public static final
  //전원을 켜다.
  abstract void on();
  //전원을 끄다.
  abstract public void off();
}
