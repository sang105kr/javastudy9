package com.kh.excercise17.q7;

import java.util.Comparator;
import java.util.TreeSet;

public class Main {
  public static void main(String[] args) {
    MyData m1 = new MyData("자바 프로그램");
    MyData m2 = new MyData("반가워");
    MyData m3 = new MyData("감사합니다");
    TreeSet<MyData> treeSet = new TreeSet<>();
    treeSet.add(m1);
    treeSet.add(m2);
    treeSet.add(m3);
    System.out.println(treeSet);

//    DecedingByDic decedingByDic = new DecedingByDic();
    TreeSet<MyData> treeSet2 = new TreeSet<>(new DecedingByDic());
    treeSet2.add(m1);
    treeSet2.add(m2);
    treeSet2.add(m3);
    System.out.println(treeSet2);

    Comparator op1 = new Comparator<MyData>(){

      @Override
      public int compare(MyData o1, MyData o2) {
        return o1.str.compareTo(o2.str) * -1;
      }
    };
    TreeSet<MyData> treeSet3 = new TreeSet<>(op1);
    treeSet3.add(m1);
    treeSet3.add(m2);
    treeSet3.add(m3);
    System.out.println(treeSet3);


    //1) 문자열 길이 오름차순 (이름있는 구현클래스-AscendingByLengthOfString)
    System.out.println("문자열 길이 오름차순 (이름있는 구현클래스-AscendingByLengthOfString)");
    TreeSet<MyData> treeSet4 = new TreeSet<>(new AscendingByLengthOfString());
    treeSet4.add(m1);
    treeSet4.add(m2);
    treeSet4.add(m3);
    System.out.println(treeSet4);

    //2) 문자열 길이 오름차순 (익명 구현클래스)
    System.out.println("문자열 길이 오름차순 (익명 구현클래스)");
    TreeSet<MyData> treeSet5 = new TreeSet<>(new Comparator<MyData>() {
      @Override
      public int compare(MyData o1, MyData o2) {
        int result = 0;
        if(o1.str.length() > o2.str.length()){
          result = 1;
        }else if(o1.str.length() < o2.str.length()) {
          result = -1;
        }
        return result;
      }
    });
    treeSet5.add(m1);
    treeSet5.add(m2);
    treeSet5.add(m3);
    System.out.println(treeSet5);

    //3) 문자열 길이 내림차순 (이름있는 구현클래스-DecendingByLengthOfString)
    System.out.println("문자열 길이 내림차순 (이름있는 구현클래스-DecendingByLengthOfString)");
    TreeSet<MyData> treeSet6 = new TreeSet<>(new DecendingByLengthOfString());
    treeSet6.add(m1);
    treeSet6.add(m2);
    treeSet6.add(m3);
    System.out.println(treeSet6);

    //4) 문자열 길이 내림차순 (익명 구현클래스)
    System.out.println("문자열 길이 내림차순 (익명 구현클래스)");
    TreeSet<MyData> treeSet7 = new TreeSet<>(new Comparator<MyData>() {
      @Override
      public int compare(MyData o1, MyData o2) {
        int result = 0;
        if(o1.str.length() < o2.str.length()){
          result = 1;
        }else if(o1.str.length() > o2.str.length()) {
          result = -1;
        }
        return result;
      }
    });
    treeSet7.add(m1);
    treeSet7.add(m2);
    treeSet7.add(m3);
    System.out.println(treeSet7);


  }
}
