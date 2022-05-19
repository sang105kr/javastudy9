package com.kh.exam1;

import java.lang.*;

public class Person extends Object{

  private final int MINAGE = 1;
  private final int MAXAGE = 100;

  //멤버 필드
  private String name;    //이름
  private int age;        //나이
  private Gender gender;  //성별

  //생성자 메소드
  public Person(){
    super();  // 상위 개념의 디폴트 생성자 호출.
  }

  public Person(String name) {
    //super(); this()랑 같이 사용 불가
    this(name,1,Gender.MEN); //자신의 생성자 호출
  }

  public Person(int age, Gender gender) {
    //super();
    this.age = age;
    this.gender = gender;
  }

  public Person(String name, Gender gender){
    //super(); // 상위 개념의 디폴트 생성자 호출.
    this.name = name;
    this.age = 1;
    this.gender = gender;
  }

  public Person(String name, int age, Gender gender) {
    //super();
    this.name = name;
    this.age = age;
    this.gender = gender;
  }

  //멤버 메소드
  public void smile(){
    System.out.println("웃다");
  }
  public void eat(){
    System.out.println("먹다");
  }

  public String getName() {
    return name.substring(1);
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if( age >= MINAGE && age <= MAXAGE) {
      this.age = age;
    }
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

  @Override
  public String toString() {
    String str = "";
    str += "이름 : " + this.name + "\n";
    str += "나이 : " + this.age + "\n";
    str += "성별 : " + this.gender + "\n";
    return str;
  }
}
