package com.kh.exam2;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person(20);
    Person p2 = new Person(20);

    System.out.println(p1==p2);
    System.out.println(p1.equals(p2));

  }
}
