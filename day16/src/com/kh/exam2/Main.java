package com.kh.exam2;

import java.util.Queue;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person("홍길동1");
    Person p2 = new Person("홍길동2");
    Person p3 = new Person("홍길동3");
    Person p4 = new Person("홍길동4");

    Queue<Person> waitingLine = new WaitingLine<>();
    waitingLine.offer(p2);
    waitingLine.offer(p1);
    waitingLine.offer(p3);
    waitingLine.offer(p4);

    while (!waitingLine.isEmpty()) {
      Person person = waitingLine.poll();
      System.out.println(person);
      System.out.println(waitingLine.size());
    }
  }
}
