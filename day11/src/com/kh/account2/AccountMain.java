package com.kh.account2;

import java.util.Arrays;
import java.util.Scanner;

public class AccountMain {
  public static void main(String[] args) {
    Bank bank = new Bank();

    Scanner scanner = new Scanner(System.in);
    boolean stop = false;

    while (!stop) {
      String accountName = null;   //예금주이름
      String accountNumber = null; //계좌번호
      int money = 0;               //입출금액

      System.out.println("1.신규 2.폐지 3.입금 4.출금 5.계좌조회(개별) 6.계좌조회(전체) 7.종료");
      System.out.print("선택 >> ");
      String menu = scanner.nextLine();
      switch (menu) {
        case "1" : //신규
          System.out.print("이름 > ");
          accountName = scanner.nextLine();
          bank.createAccount(accountName);
          break;
        case "2" : //폐지
          System.out.print("계좌번호 > ");
          accountNumber = scanner.nextLine();
          bank.closeAccount(accountNumber);
          break;
        case "3" : //입금
          System.out.print("계좌번호 > ");
          accountNumber = scanner.nextLine();
          System.out.print("입금액 > ");
          money = Integer.parseInt(scanner.nextLine());
          bank.deposit(accountNumber,money);
          break;
        case "4" : //출금
          System.out.print("계좌번호 > ");
          accountNumber = scanner.nextLine();
          System.out.print("출금액 > ");
          money = Integer.parseInt(scanner.nextLine());
          bank.withdraw(accountNumber,money);
          break;
        case "5" : //계좌조회(개별)
          System.out.print("계좌번호 > ");
          accountNumber = scanner.nextLine();
          bank.printAccount(accountNumber);
          break;
        case "6" : //계좌조회(전체)
          bank.printAllAccount();
          break;
        case "7" : //종료
          stop = true;
          continue;
        default:
          System.out.println("선택한 메뉴가 없습니다!");
      }
    }
  }
}
