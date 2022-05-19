package com.kh.exam2;

import java.util.Scanner;

public class DiceMain {

  public static void main(String[] args) {
    //주사위 인스턴스 2개 생성
    Dice dice1 = new Dice();
    Dice dice2 = new Dice();

    Scanner scanner = new Scanner(System.in);

    boolean stop = false;
    do {
      //주사위 인스턴스 각각 던지는 행위
      dice1.roll();
      dice2.roll();

      // 2개주사위 눈의 합이 10보다 크면 "당첨"
      int sumOfDice = dice1.getFaceValue() + dice2.getFaceValue();

      System.out.println("dice1의 눈 : " + dice1.getFaceValue());
      System.out.println("dice2의 눈 : " + dice2.getFaceValue());

      if (sumOfDice > 10) {
        System.out.println("당첨!");
      } else {
        System.out.println("꽝!");
      }
      System.out.print("계속하시겠습니까?(종료:n)");
      String input = scanner.nextLine();

      if(input.equals("n")){
        stop = true;
      }
    }while(!stop);
  }
}
