package com.kh.exam2;

import java.lang.*;
/**
  은행계좌 설계
 */
public class Account extends Object{
  private String accountOwner;  //계정소유자
  private long   balance;       //잔액  0l;

  public Account(String accountOwner) {
    super();
    this.accountOwner = accountOwner;
  }

  //입금
  public void deposit(int money) {
    this.balance += money;
  }

  //출금
  public void withdraw(int money) {
    this.balance -= money;
  }

  @Override
  public String toString() {
    return "계좌{" +
        "계좌소유자명='" + accountOwner + '\'' +
        ", 잔액=" + balance +
        '}';
  }

  public String getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  public long getBalance() {
    return balance;
  }

  public void setBalance(long balance) {
    this.balance = balance;
  }

}
