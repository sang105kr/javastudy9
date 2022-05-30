package com.kh.exam3;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
  public static void main(String[] args) {
    Set<Person> set = new HashSet<>();

    Person p1 = new Person("홍길동",30);
    Person p2 = new Person("홍길동",30);
    Person p3 = new Person("홍길순",20);
    Person p4 = new Person("홍길동",40);

    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);

    System.out.println(set);

    p1.equals(p2);
    //Object.toString : 패키지.클래스명@해시코드
//    System.out.println(p1.toString());
//    System.out.println(p1.hashCode());
//    System.out.println(p2.hashCode());
//    System.out.println(p3.hashCode());
//    System.out.println(p4.hashCode());


  }
}
