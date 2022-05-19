package com.kh.exam3;

import java.util.Scanner;

public class AccountMain {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    boolean stop = false;
    Account account = null;
    do {
      //메뉴 출력
      System.out.println("메뉴] 1.계좌개설 2.입금 3.출금 4.잔액조회 5.종료 ");
      System.out.print(">>");
      String menuValue = scanner.nextLine();
      
      int money = 0; // 입출금액
      switch (menuValue) {
        case "1": //계좌계설
          System.out.println("이름을 입력하세요");
          System.out.print(">> ");
          String name = scanner.nextLine();
          account = new Account(name);
          System.out.println( name + "님의 계좌가 개설되었습니다.");
          break;
        case "2": //입금
          if(account == null) {
            System.out.println("계좌 미개설 상태입니다~");
            continue;
          }
          System.out.print("입금액 >> ");
          money = Integer.valueOf(scanner.nextLine());
          //입금
          account.deposit(money);

          break;
        case "3": //출금
          if(account == null) {
            System.out.println("계좌 미개설 상태입니다~");
            continue;
          }
          System.out.print("출금액 >> ");
          money = Integer.valueOf(scanner.nextLine());
          //출금
          account.withdraw(money);
          break;

        case "4": //잔액조회
          if(account == null) {
            System.out.println("계좌 미개설 상태입니다~");
            continue;
          }
          long balance = account.getBalance();
          System.out.println(account.getAccountOwner() +" 님의 잔액 : " + balance);
          break;
        case "5": //종료
          stop = true;
          break;
        default:

      }

    } while (!stop);
  }
}
