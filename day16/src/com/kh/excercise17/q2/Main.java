package com.kh.excercise17.q2;

import java.util.ArrayList;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>();
    list.add(2);
    list.add(3);
    list.add(4);
    System.out.println(list);
    list.remove(2);
    System.out.println(list);
  }
}
