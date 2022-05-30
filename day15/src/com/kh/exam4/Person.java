package com.kh.exam4;

import java.util.Objects;

public class Person implements Comparable<Person>{
  private String name;
  private int age;

  public Person(String name, int age) {
    this.name = name;
    this.age = age;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age && Objects.equals(name, person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, age);
  }

  @Override
  public String toString() {
    return "Person{" +
        "name='" + name + '\'' +
        ", age=" + age +
        '}';
  }

  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  // <<오름차순>>
  // 비교대상 객체가 동일하면 0을 반환
  // 비교대상 객체보다 크면 1을 반환
  // 비교대상 객체보다 작으면 -1을 반환
  // <<내림차순>>
  // 비교대상 객체가 동일하면 0을 반환
  // 비교대상 객체보다 작으면 1을 반환
  // 비교대상 객체보다 크면 -1을 반환
  @Override
  public int compareTo(Person o) {
    int result = 0;
    if(this.age > o.age){
      result = 1;
    }else if( this.age < o.age){
      result = -1;
    }
    return result;
  }
}
