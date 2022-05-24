package com.kh.exam3;

public class PersonMain {

  public static void main(String[] args) {
    Person p1 = new Person("홍길동", 30);
    Person p2 = new Person("홍길동", 30);

    System.out.println( p1 == p2);      //동일비교(물리적)
    System.out.println( p1.equals(p2)); //동등비교(내용적)
  }

}
