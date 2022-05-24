package com.kh.exam3;

import java.util.Objects;

public class Person {
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) return false;
    if( !(o instanceof Person)) return false;
    Person person = (Person) o;
    return this.name.equals(person.name) && this.age == person.age;
  }
}
