package com.kh.exam1;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동");
    Person p2 = new Person("홍길순");
    Person p3 = new Person("홍길서");
    Person p4 = new Person("홍길동");

    Set<Person> set = new HashSet<Person>();
    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);

    System.out.println(set);

  }
}
