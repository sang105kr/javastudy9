package com.kh.exam4;

public class Account {

  private int LIMIT_MONEY_ONETIME = 100_000;  //1회 입금한도
  private int LIMIT_BALANCE = -1_000_000;      //마이너스 잔액한도

  private String accountOwner; //계좌소유자
  private long balance;        // 잔액
  public Account(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  public Account(int LIMIT_MONEY_ONETIME, int LIMIT_BALANCE, String accountOwner, long balance) {
    this.LIMIT_MONEY_ONETIME = LIMIT_MONEY_ONETIME;
    this.LIMIT_BALANCE = LIMIT_BALANCE;
    this.accountOwner = accountOwner;
    this.balance = balance;
  }

  //입금
  public void deposit(int money) {
    if( money < 1 || money > LIMIT_MONEY_ONETIME){
      System.out.println("1회 입금액은" + LIMIT_MONEY_ONETIME + "만원 미만 이어야 합니다.");
      return;
    }
    this.balance += money;
  }

  //출금
  public void withdraw(int money) {
    if( money < 1 ){
      return;
    }
    if( this.balance - money < LIMIT_BALANCE){
      System.out.println("잔액 한도는 "+ LIMIT_BALANCE +" 입니다.");
      return;
    }
    this.balance -= money;
  }

  //잔액
  public long getBalance(){
    return this.balance;
  }
  public String getAccountOwner() {
    return accountOwner;
  }
}
