package com.kh.exam7;
/*
  abstract + class (미완성 개념) :
    1. 인스턴스를 만들수 없다.
    2. 타입(개념)으로는 사용할수 있다.
    3. abstract메소드가 없어도 abstract 키워드 사용가능

  abstract + method (미완성 메소드):
    1. 메소드 선언부만 존재, 바디(X)
    2. abstract메소드가 하나라도 존재하면
       그 클래스는 abstract클래스 이어야한다.

 */
public abstract class Person {

  public Person(){
    super();
    System.out.println("Person생성자 호출");
  }
  abstract public void smile();
  public void eat(){
    System.out.println("먹다");
  }
}
