package com.kh.exam2;

import com.kh.Account;

public class AccountMain {
  public static void main(String[] args) {
    Account account = new Account("홍길동");
    System.out.println(account);

    //입금
    try {
      account.deposit(50_000);
    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    System.out.println(account);

    //출금
    try {
      account.widthraw(50_000);
    } catch (WidthrawUnerException e) {
      System.out.println(e.getMessage());

    } catch (WidthrawOverException e) {
      System.out.println(e.getMessage());

    }
    System.out.println(account);

  }
}
