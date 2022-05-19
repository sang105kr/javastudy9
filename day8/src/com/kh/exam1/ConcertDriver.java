package com.kh.exam1;

// 실습과제 8.3: ConcertDriver.java
// 콘서트 클래스를 시험한다

import java.util.Scanner;

public class ConcertDriver {
  public static void main(String[] args) {
    // 가수의 이름은 ‘가수왕’이고 공연 장소의 수용 인원은 100명이고
    // 인터넷 티켓 가격은 10,000원이고 현장 티켓 가격은 20,000원인
    // Concert 객체를 만든다

    Concert concert = new Concert("가수왕", 100, 10_000, 20_000);

    System.out.println("콘서트 판매 프로그램을 시작합니다");

    Scanner reader = new Scanner(System.in);

    boolean done = false;

    // 티켓 판매가 종료될 때까지 티켓을 판다
    while (!done) {
      // 티켓 판매 방법을 입력받는다
      if (concert.webSalesOnly())
        System.out.print("\n인터넷 판매이면 S, 현장 판매로 바꾸려면 V, 판매를 종료하려면 F를 입력하세요: ");
      else
        System.out.print("\n현장 판매이면 S, 판매를 종료하려면 F를 입력하세요: ");

      String response = reader.next();

      // 티켓 판매 방법에 따라 티켓을 판다
      // 판매 종료를 원하면 판매를 종료하게 만든다
      // 인터넷 판매이면 티켓을 인터넷 가격으로 판다
      // 현장 판매로 바꾸기를 원하면 티켓을 현장 가격으로 판다
      // 티켓 판매 방법이 틀리게 입력되면 오류 메시지를 출력한다.

      switch (response) {
        case "S":
          concert.doTicketSale();
          break;
        case "V":
          concert.webSalesOver(); //인터넷 판매종료 상태로 변환
          break;
        case "F":
          done = true;
          break;
        default:
          System.out.println("잘못 선택했습니다!");
      }

      // 판매 후 남은 티켓들의 수를 출력한다,
      System.out.println("남은 티켓들의 수 : " + concert.getTicketsLeft());
    }

    // 팔린 티켓 수와 총 판매 금액을 출력한다
    System.out.println("<< 총 판매 보고서 >>");
    System.out.println(concert.getSalesReport());
  }
}
