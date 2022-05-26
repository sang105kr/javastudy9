package com.kh.exam1;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {
    int[] arr = new int[3];
    System.out.println(Arrays.toString(arr));

    try {
      //오류가 예상되는 코드
      arr[3] = 10;
    } catch (ArrayIndexOutOfBoundsException e) {
      //e.printStackTrace();
      System.out.println("범위를 초과하였습니다!");
    } finally {
      // 오류 발생여부에 상관없이 실행되는 블럭
      System.out.println("finall블럭 실행됨!");
    }
  }
}
