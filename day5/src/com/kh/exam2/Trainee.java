package com.kh.exam2;

public class Trainee {
  //명사
  String name;  //이름
  int age;   //나이
  String gender; //성별

  //생성자 메소드 특징 :
  //   1. 클래스 이름과 동일
  //   2. 메소드 모양을 하고 있지만 반환타입이 없다.
  //   3. 생성자 메소드는 여러개 생성할 수 있다. (생성자 오버로딩)
  //       오버로딩 :이름이 같고 매개변수가 다른(매개변수의 갯수, 타입이 다른)
  //디폴트 생성자 메소드 : 개발자가 정의해 주지 않더라도
  //                    자동으로 컴파일러가 생성해서 넣어준다.
  // this: 미래에 생성될 실체(인스턴스) 가리키는 참조변수.
  public Trainee(){
    super();
  }
  public Trainee(String name, int age){
    this.name = name;
    this.age = age;
  }
  public Trainee(String name, int age, String gender) {
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  //동사
  public void study(){
    System.out.println("공부하다");
  }
  public void doHomeWork(){
    System.out.println("과제를 수행하다");
  }
}
