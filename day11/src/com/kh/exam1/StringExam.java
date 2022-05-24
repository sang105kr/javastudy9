package com.kh.exam1;

public class StringExam {
  public static void main(String[] args) {
    // 기본타입 값비교 ==
    int x = 10;
    int y = 10;
    int z = 30;
    System.out.println( x==y );
    System.out.println( x==z );

    // 참조타입 값비교(힙메모리 참조하는 주소) ==
    System.out.println("=============");
    String name = "홍길동";
    String name2 = "홍길동";
    String name3 = "홍길순";
    System.out.println( name==name2);
    System.out.println( name==name3);

    System.out.println("=============");
    String name5 = new String("홍길동");
    String name6 = new String("홍길동");
    String name7 = new String("홍길순");
    System.out.println(name5==name6);
    System.out.println(name5==name7);

    // Object.equals() : 인스턴스간 == 주소비교
    // String.equals() : // 인스턴스가 가지고있는 문자열 내용이 같은지 비교

    System.out.println(name5.equals(name6));

  }
}
