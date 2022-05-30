package com.kh.exam6;

import java.util.Calendar;
import java.util.Map;

public class Main {
  public static void main(String[] args) {
    Dictionary d1 = Dictionary.getInstance();
    Dictionary d2 = Dictionary.getInstance();

    System.out.println(d1 == d2);
    System.out.println(d1.hashCode());
    System.out.println(d2.hashCode());

//    Map map = d1.getStore();
//    map.put("student", "학생");
//    map.put("teacher", "교사");
    d1.getStore().put("student", "학생");
    d1.getStore().put("teacher", "교사");
    d2.getStore().put("classroom", "교실");

    System.out.println(d1);

    Calendar cal1 = Calendar.getInstance();
    System.out.println(cal1.getTime());
    Calendar cal2 = Calendar.getInstance();

    System.out.println(cal1 == cal2);

    System.out.println(cal1.hashCode());
    System.out.println(cal2.hashCode());
  }
}
