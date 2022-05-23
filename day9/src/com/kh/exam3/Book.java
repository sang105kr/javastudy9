package com.kh.exam3;
/*
  static 사용 연습
  - bookId는 인스턴스 생성시 순차적으로 번호를 생성한다.
  - bookId는 인스턴스별로 중복되지 않아야한다.

 */
public class Book {
  private String title;
  private int bookId;
  private static int count;

  public Book(String title){
    this.title = title;
//    bookId = ++count;
//    bookId = count = getCount() + 1;
    count = getCount() + 1;
    bookId = count;
  }

  public String getTitle() {
    return title;
  }

  public int getBookId() {
    return bookId;
  }

  public static int getCount() {
    return count;
  }
}
