package com.kh.excercise10.q10;

/**
 * this(), super() 같이 올수 없다.
 */
class A {
  A(){
    System.out.println("A 생성자1");
  }
  A(int a){
    this();
    System.out.println("A 생성자2");
  }
}
