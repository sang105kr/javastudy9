package com.kh.exam2;

import java.util.Scanner;

public class Student {
  // 객체 변수들
  String name;      // 이름
  int quizscore;      // 퀴즈 점수
  int midtermscore;    // 중간시험 점수
  int finalscore;      // 기말시험 점수

  // 생성자메소드: 학생의 이름을 넘겨 받아 객체를 생성한다
  public Student(String studentName) {
    // 여기에 코드를 삽입하세요
  }

  // 학생의 이름을 반환한다
  public String getName() {
    return name;
  }

  // 학생의 퀴즈 점수를 반환한다
  public int getQuizScore() {
    // 여기에 코드를 삽입하세요
  }

  // 학생의 중간시험 점수를 반환한다
  public int getMidtermScore() {
    // 여기에 코드를 삽입하세요
  }

  // 학생의 기말시험 점수를 반환한다
  public int getFinalScore() {
    // 여기에 코드를 삽입하세요
  }

  //   현 Student 객체의 정보에 대한 문자열을 반환한다.
  public String toString() {
    String str = "";
    str += "이름: " + name + "\n";
    // 여기에 코드를 삽입하세요
  }

  // 이름을 주어진 값으로 변경한다
  public void setName(String Name) {
    name = Name;
  }

  // 퀴즈 점수를 주어진 값으로 변경한다
  public void setQuizScore(int QuizScore) {
    // 여기에 코드를 삽입하세요
  }

  // 중간시험 점수를 주어진 값으로 변경한다
  public void setMidtermScore(int MidtermScore) {
    // 여기에 코드를 삽입하세요
  }

  // 기말시험 점수를 주어진 값으로 변경한다
  public void setFinalScore(int FinalScore) {
    // 여기에 코드를 삽입하세요
  }

  // 사용자에게 학생의 퀴즈 점수, 중간시험 점수와 기말시험 점수를 읽어 들인다.
  // 입력 요청시 이름을 사용한다. 예를 들면, ‘길동의 중간시험 점수를 입력하라.’
  public void inputGrades() {
    Scanner scan = new Scanner(System.in);
    // 여기에 코드를 삽입하세요
  }

  // 학생의 시험 점수들의 총점을 계산하여 반환한다
  public double getTotal() {
    // 여기에 코드를 삽입하세요
  }

  // 학생의 학점을 반환한다
  // 여기에 메소드드를 삽입하세요
}
