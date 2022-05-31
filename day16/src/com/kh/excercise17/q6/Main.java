package com.kh.excercise17.q6;

import java.util.HashSet;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Set<Data> set = new HashSet<>();
    set.add(new Data(2,3));
    set.add(new Data(2,4));
    set.add(new Data(3,4));

    System.out.println(set.size());
    for (Data data : set) {
      System.out.println(data.hashCode());
    }
  }
}
