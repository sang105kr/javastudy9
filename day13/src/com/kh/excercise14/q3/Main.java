package com.kh.excercise14.q3;

public class Main {
  public static void main(String[] args) {

    try {
      int[] array = {1, 2, 3};
      int index = 4;
      System.out.println(array[index]);

      A aa = new A();
      B bb = (B)aa;
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("배열값 읽기 실패");
    } catch (ClassCastException e) {
      System.out.println("클래스 다운 캐스팅 실패");
    } finally {
      System.out.println("처리완료");
    }


//    try {
//      int[] array = {1, 2, 3};
//      int index = 4;
//      System.out.println(array[index]);
//
//    } catch (ArrayIndexOutOfBoundsException e) {
//      System.out.println("배열값 읽기 실패");
//    } finally {
//      System.out.println("처리완료");
//    }
//
//    try {
//      A aa = new A();
//      B bb = (B)aa;
//    } catch (ClassCastException e) {
//      System.out.println("클래스 다운 캐스팅 실패");
//    } finally {
//      System.out.println("처리완료");
//    }
  }
}
