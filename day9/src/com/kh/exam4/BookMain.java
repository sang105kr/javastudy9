package com.kh.exam4;

public class BookMain {
  public static void main(String[] args) {
    Book b1 = new Book("제목1");
    Book b2 = new Book("제목2");
    Book b3 = new Book("제목3");

    System.out.println(b1.getBookId()); // 1
    System.out.println(b2.getBookId()); // 2
    System.out.println(b3.getBookId()); // 3

    // 최근 bookId정보 출력하기.
    System.out.println(Book.getCount());
  }
}
