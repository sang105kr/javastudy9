package com.kh.exam2;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person();
    Person p2 = new Person();
    Person p3 = new Person();

    //Object.toString : 패키지.클래스명@해시코드
    System.out.println(p1.toString());
    System.out.println(p1.hashCode());
    System.out.println(p2.hashCode());
    System.out.println(p3.hashCode());
  }
}
