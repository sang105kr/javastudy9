package com.kh.exam4;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class PersonMain {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동1",20);
    Person p2 = new Person("홍길동2",40);
    Person p3 = new Person("홍길동3",30);
    Person p4 = new Person("홍길동4",10);
    Set<Person> set = new TreeSet<>();

    set.add(p1);
    set.add(p2);
    set.add(p3);
    set.add(p4);
    System.out.println(set);


    Set<Person> set2 = new TreeSet<>(new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        int result = 0;
        if( o1.getAge() < o2.getAge()){
          result = 1;
        }else if(o1.getAge() > o2.getAge() ){
          result = -1;
        }
        return result;
      }
    });
//    Set<Person> set2 = new TreeSet<>(
//        (Person o1, Person o2)->{
//          int result = 0;
//          if( o1.getAge() < o2.getAge()){
//            result = 1;
//          }else if(o1.getAge() > o2.getAge() ){
//            result = -1;
//          }
//          return result;
//      });
    set2.add(p1);
    set2.add(p2);
    set2.add(p3);
    set2.add(p4);
    System.out.println(set2);


  }
}
