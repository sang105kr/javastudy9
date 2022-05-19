package com.kh.exam1;

public class PersonMain {
  public static void main(String[] args) {

    Person p1 = new Person();
    p1.smile();
    p1.eat();

    Person p2 = new Person();
    p2.smile();
    p2.eat();

    Person p3 = new Person("홍길동", Gender.MEN);
    p3.smile();
    p3.eat();
    System.out.println(p3.getName());
    p3.setName("홍길남");
    System.out.println(p3.getName());
    System.out.println(p3.toString());

    p3.setName("홍길북");
    System.out.println(p3.toString());

    p3.setName("홍길서");
    p3.setAge(20);
    p3.setGender(Gender.MEN);
    System.out.println(p3.toString());
    System.out.println(p3);

    System.out.println(p3.getName());
  }
}
