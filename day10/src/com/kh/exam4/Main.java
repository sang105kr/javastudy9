package com.kh.exam4;

public class Main {
  public static void main(String[] args) {
    Person p1 = new Person();
    p1.eat();
    p1.smile();
    //p1.study();

    System.out.println("=======");

    Student s1 = new Student();
    s1.eat();
    s1.smile();
    s1.study();
//    s1.teach();

    Teacher t1 = new Teacher();
    t1.eat();
    t1.smile();
    t1.teach();
//    t1.study();

    //하위개념을 상위개념에 대입(O)
    //하위개념의 실체를 상위개념으로 다루겠다.
    Person p2 = s1;             //자동 형변환

    //상위개념을 하위개념에 대입(X)
    //Student s2 = p2;
    Student s2 = (Student)p2;  //강제 형변환
    s2.study();


    //컴파일 시점에서는 오류가 안나지만 런타임시점에서는
    //형변환할수 없다는 오류가 발생한다.
    //강제 형변환의 전제조건 : 실체가 강제형변환하려는 타입이어야한다.
    Person p3 = p1;
    Student s3 = (Student)p3;
    s3.study();

  }
}
