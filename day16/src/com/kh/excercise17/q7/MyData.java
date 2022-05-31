package com.kh.excercise17.q7;

import java.util.Calendar;

public class MyData implements Comparable<MyData> {
  String str;

  public MyData(String str) {
    this.str = str;
  }

  @Override
  public int compareTo(MyData o) {
    System.out.println("compareTo()호출됨!");
//    int result = 0;
//    if(this.str.length() > o.str.length()){
//      result = 1;
//    }else if (this.str.length() < o.str.length()) {
//      result = -1;
//    }
//    return result;
    return this.str.compareTo(o.str);
  }

  @Override
  public String toString() {
    return str;
  }

  @Override
  public int hashCode() {
    System.out.println("hashCode()호출됨!");
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    System.out.println("equals()호출됨!");
    return super.equals(obj);
  }
}
