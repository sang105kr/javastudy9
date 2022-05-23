package com.kh.exam2;
/*
  static 초기화블럭 : static 멤버필드를 초기화하기위해 사용됨
                    (인스턴스 멤버 필드 사용불가)
  인스턴스 초기화블럭 : 인스턴스멤버를 초기화하기위해 사용됨
                     (생성자보다 먼저 실행된다)
 */
public class Person {
  static String national = "한국";
  String name;
  {
    System.out.println("5");
    name = "홍길동";
  }
  static {
    System.out.println("6");
    //System.out.println(name);
    national = "korean";
  }
  public Person(){
    super();
    System.out.println("3");
  }
}
