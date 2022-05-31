package com.kh.excercise17.q7;

import java.util.Comparator;

public class DecedingByDic implements Comparator<MyData> {

  @Override
  public int compare(MyData o1, MyData o2) {
    return o1.str.compareTo(o2.str) * -1;
  }
}
