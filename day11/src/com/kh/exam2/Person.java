package com.kh.exam2;

public class Person {
  private int age;
  public Person(int age){
    this.age = age;
  }

  @Override
  public boolean equals(Object obj) {
    return this.age == ((Person)obj).age;
  }
}
