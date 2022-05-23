package com.kh.exam4;
/*
  static 사용 연습
  - bookId는 인스턴스 생성시 순차적으로 번호를 생성한다.
  - ex) 001,002,003..999
  - bookId는 인스턴스별로 중복되지 않아야한다.

 */
public class Book {
  private String title;
  private String bookId;
  private static int count;
  private final int BOOKID_SIZE = 3;

  public Book(String title){
    this.title = title;
//    bookId = ++count;
//    bookId = count = getCount() + 1;
    count = getCount() + 1;

    //1)계산 결과 문자열로변환 후 자리수 체크
    String tmp = count + ""; //  "10"
    int length = BOOKID_SIZE-tmp.length();
    for(int i=0; i < length ; i++){
      tmp = "0" + tmp;
    }
    bookId = tmp;
  }

  public String getTitle() {
    return title;
  }

  public String getBookId() {
    return bookId;
  }

  public static int getCount() {
    return count;
  }
}
