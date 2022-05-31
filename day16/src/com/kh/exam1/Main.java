package com.kh.exam1;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<Coin> coinLocker = new CoinLocker();
    Coin coin10 = new Coin(10);
    Coin coin50 = new Coin(50);
    Coin coin100 = new Coin(100);
    Coin coin500 = new Coin(500);

    //요소 담기
    coinLocker.push(coin10);
    coinLocker.push(coin50);
    coinLocker.push(coin100);
    coinLocker.push(coin500);
    System.out.println(coinLocker);

    //요소 검색
    int idx = coinLocker.search(coin100);
    System.out.println("동전위치 : " + idx);


    //요소 꺼내기
    while (!coinLocker.isEmpty()){
      Coin coin = coinLocker.pop();
      System.out.println(coin);
      System.out.println(coinLocker.size());
    }

  }
}
