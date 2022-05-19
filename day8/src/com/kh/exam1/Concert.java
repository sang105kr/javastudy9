package com.kh.exam1;

// 실습과제 8.3: Concert.java
// 콘서트 티켓을 모델한다

import java.util.Scanner;

public class Concert {
  // 가수의 이름
  private String singerName;

  // 공연 장소의 수용 인원
  private int capacity;

  // 팔린 티켓 수
  private int ticketsSold;

  // 변수들
  // 인터넷 티켓 가격, 현장 티켓 가격, 총 판매 금액과 인터넷 판매 가능 여부
  // 인터넷 티켓 가격
  private int costOverWeb;
  // 현장 티켓 가격
  private int costAtVenue;
  // 총판매금액
  private int totalSalesPrice;
  // 인터넷 판매 가능여부
  private boolean webSalesabl = true;
  // 여기에 코드를 삽입하세요


  // 생성자 메소드
  // 가수의 이름, 공연 장소의 수용 인원, 인터넷 티켓 가격과 현장 티켓 가격을
  // 각각 주어진 값으로 초기화하면서 객체를 생성한다
  public Concert(String name, int max, int costOverWeb, int costAtVenue) {
    this.singerName = name;
    this.capacity = max;
    this.costOverWeb = costOverWeb;
    this.costAtVenue = costAtVenue;
  }

  // 티켓을 판다
  public void doTicketSale() {
    // 남은 티켓들의 수를 알려 준다
    System.out.print("남은 티켓들 수는? (최대 " + getTicketsLeft() + ") ");

    // 구매 요청한 티켓 수를 입력 받는다
    Scanner reader = new Scanner(System.in);
    int toSell = reader.nextInt();

    // 티켓을 판다
    boolean saleCompleted = sellTickets(toSell);

    // 판매가 완료되면 티켓들의 총 가격을 출력하고
    // 티켓을 판매할 수 없으면 오류 메시지를 출력한다
    if(saleCompleted){
      System.out.println("티켓들의 총 가격 : " + getTotalSales());
    }else{
      System.out.println("죄송합니다. 잔여수량이 부족합니다.");
      //System.out.println("현재 남아있는 잔여수량 : " + getTicketsLeft());
    }
  }

  // 구매 요청한 수만큼 티켓을 판다
  // 티켓을 판매할 수 있으면 판매 기록을 갱신하고 true를 반환한다
  // 티켓을 판매할 수 없으면 false를 반환한다
  public boolean sellTickets(int number) {
    boolean flag = false;
    // 티켓 잔여수량 >= 티켓 구매수량
    if(getTicketsLeft() >= number){
      ticketsSold += number;                    //티켓판매수량 누적
      totalSalesPrice += getSaleCost(number);   //판매금액 누적
      flag = true;
    }else{

      flag = false;
    }
    return flag;
  }

  // 구매 요청한 티켓들의 가격을 계산한 후 반환한다
  public int getSaleCost(int number) {
    int price = 0;
    //인터넷 단가 or 현장단가
    if(webSalesOnly()){
      price = this.costOverWeb * number;
    }else{
      price = this.costAtVenue * number;
    }
    return price;
  }

  // 인터넷 판매를 종료한다
  public void webSalesOver() {
    this.webSalesabl = false;
  }

  // 팔린 티켓들의 수를 알려 준다
  public int getTicketsSold() {
    return ticketsSold;
  }

  // 남은 티켓들의 수를 알려 준다
  public int getTicketsLeft() {
//    int result = this.capacity - this.ticketsSold;
//    return result;
    return this.capacity - this.ticketsSold;
  }

  // 총 판매 금액을 알려 준다
  public int getTotalSales() {
    return this.totalSalesPrice;
  }

  // 인터넷 판매 가능 여부를 알려 준다
  public boolean webSalesOnly() {
    return this.webSalesabl;
  }

  // 팔린 티켓 수와 총 판매 금액을 반환한다
  public String getSalesReport() {
    String str = "";

    str += "팔린 티켓 수 : " + this.getTicketsSold() + "\n";
    str += "총 판매 금액 : " + this.getTotalSales() + "\n";

    return str;
  }
}
