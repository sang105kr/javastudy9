package com.kh.exam2;

public class DiceMain2 {
  public static void main(String[] args) {
    final int COUNT = 5;

    Dice[] dices = new Dice[COUNT];

    //주사위 인스턴스 생성
    for(int i=0; i<dices.length; i++){
      dices[i] = new Dice();
    }

    // 주사위던지기
    int sum = 0;
    for(int i=0; i<dices.length; i++){
      dices[i].roll();
      System.out.println( (i+1) + "번째 주사위눈 : " + dices[i].getFaceValue());
      sum += dices[i].getFaceValue();
    }

    System.out.println(COUNT +"개 주사위 눈의 합="+sum);
  }
}
