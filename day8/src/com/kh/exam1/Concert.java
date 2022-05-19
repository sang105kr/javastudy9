package com.kh.exam1;

// �ǽ����� 8.3: Concert.java
// �ܼ�Ʈ Ƽ���� ���Ѵ�

import java.util.Scanner;

public class Concert {
  // ������ �̸�
  private String singerName;

  // ���� ����� ���� �ο�
  private int capacity;

  // �ȸ� Ƽ�� ��
  private int ticketsSold;

  // ������
  // ���ͳ� Ƽ�� ����, ���� Ƽ�� ����, �� �Ǹ� �ݾװ� ���ͳ� �Ǹ� ���� ����
  // ���ͳ� Ƽ�� ����
  private int costOverWeb;
  // ���� Ƽ�� ����
  private int costAtVenue;
  // ���Ǹűݾ�
  private int totalSalesPrice;
  // ���ͳ� �Ǹ� ���ɿ���
  private boolean webSalesabl = true;
  // ���⿡ �ڵ带 �����ϼ���


  // ������ �޼ҵ�
  // ������ �̸�, ���� ����� ���� �ο�, ���ͳ� Ƽ�� ���ݰ� ���� Ƽ�� ������
  // ���� �־��� ������ �ʱ�ȭ�ϸ鼭 ��ü�� �����Ѵ�
  public Concert(String name, int max, int costOverWeb, int costAtVenue) {
    this.singerName = name;
    this.capacity = max;
    this.costOverWeb = costOverWeb;
    this.costAtVenue = costAtVenue;
  }

  // Ƽ���� �Ǵ�
  public void doTicketSale() {
    // ���� Ƽ�ϵ��� ���� �˷� �ش�
    System.out.print("���� Ƽ�ϵ� ����? (�ִ� " + getTicketsLeft() + ") ");

    // ���� ��û�� Ƽ�� ���� �Է� �޴´�
    Scanner reader = new Scanner(System.in);
    int toSell = reader.nextInt();

    // Ƽ���� �Ǵ�
    boolean saleCompleted = sellTickets(toSell);

    // �ǸŰ� �Ϸ�Ǹ� Ƽ�ϵ��� �� ������ ����ϰ�
    // Ƽ���� �Ǹ��� �� ������ ���� �޽����� ����Ѵ�
    if(saleCompleted){
      System.out.println("Ƽ�ϵ��� �� ���� : " + getTotalSales());
    }else{
      System.out.println("�˼��մϴ�. �ܿ������� �����մϴ�.");
      //System.out.println("���� �����ִ� �ܿ����� : " + getTicketsLeft());
    }
  }

  // ���� ��û�� ����ŭ Ƽ���� �Ǵ�
  // Ƽ���� �Ǹ��� �� ������ �Ǹ� ����� �����ϰ� true�� ��ȯ�Ѵ�
  // Ƽ���� �Ǹ��� �� ������ false�� ��ȯ�Ѵ�
  public boolean sellTickets(int number) {
    boolean flag = false;
    // Ƽ�� �ܿ����� >= Ƽ�� ���ż���
    if(getTicketsLeft() >= number){
      ticketsSold += number;                    //Ƽ���Ǹż��� ����
      totalSalesPrice += getSaleCost(number);   //�Ǹűݾ� ����
      flag = true;
    }else{

      flag = false;
    }
    return flag;
  }

  // ���� ��û�� Ƽ�ϵ��� ������ ����� �� ��ȯ�Ѵ�
  public int getSaleCost(int number) {
    int price = 0;
    //���ͳ� �ܰ� or ����ܰ�
    if(webSalesOnly()){
      price = this.costOverWeb * number;
    }else{
      price = this.costAtVenue * number;
    }
    return price;
  }

  // ���ͳ� �ǸŸ� �����Ѵ�
  public void webSalesOver() {
    this.webSalesabl = false;
  }

  // �ȸ� Ƽ�ϵ��� ���� �˷� �ش�
  public int getTicketsSold() {
    return ticketsSold;
  }

  // ���� Ƽ�ϵ��� ���� �˷� �ش�
  public int getTicketsLeft() {
//    int result = this.capacity - this.ticketsSold;
//    return result;
    return this.capacity - this.ticketsSold;
  }

  // �� �Ǹ� �ݾ��� �˷� �ش�
  public int getTotalSales() {
    return this.totalSalesPrice;
  }

  // ���ͳ� �Ǹ� ���� ���θ� �˷� �ش�
  public boolean webSalesOnly() {
    return this.webSalesabl;
  }

  // �ȸ� Ƽ�� ���� �� �Ǹ� �ݾ��� ��ȯ�Ѵ�
  public String getSalesReport() {
    String str = "";

    str += "�ȸ� Ƽ�� �� : " + this.getTicketsSold() + "\n";
    str += "�� �Ǹ� �ݾ� : " + this.getTotalSales() + "\n";

    return str;
  }
}
