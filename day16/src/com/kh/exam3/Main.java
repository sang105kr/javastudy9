package com.kh.exam3;

import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args) {
    TreeMap<String, String> map = new TreeMap<>();

    map.put("student", "학생");
    map.put("teacher", "교사");
    map.put("classroom", "교실");
    map.put("safe", "안전한");
    map.put("teeth", "이");

    String word = map.get("student");
    System.out.println(word);


    String word2 = map.get("sTudent");
    System.out.println(word2);

    System.out.println("sTudent".toLowerCase()); //소문자로 변환
    System.out.println("sTudent".toUpperCase()); //대문자로 변환


    String word3 = map.get("sTudent".toLowerCase());
    System.out.println(word3);

    //s로 시작하는 단어 찾기
    //범위검색 : headMap, tailMap, subMap
    NavigableMap<String, String> subMap = map.subMap("s", true, "teeth", true);
    System.out.println(subMap);


//    String str = "student";
//
//    //단어내의 문자위치 from 검색문자
//    System.out.println(str.indexOf('u'));
//    System.out.println(str.indexOf("u"));
//    System.out.println(str.indexOf("z")); // 못찾으면 -1반환
//    if(str.indexOf('z') != -1){
//      System.out.println("z 문자 포함");
//    }else{
//      System.out.println("z 문자 미포함");
//    }
//
//    //단어내의 문자추출 from 문자위치
//    System.out.println(str.charAt(2));
//
//    //단어내의 일부문자 추출
//    System.out.println(str.substring(0));
//    System.out.println(str.substring(2,4));
//
//    //단어내의 일부문자를 새로운 문자열로 대체
//    System.out.println(str.replace('u','o'));
//    System.out.println(str.replace("od","ud"));
//    System.out.println(str.replace('t','T'));
//
//    //단어내에 특정 문자열이 포함되어있는지
//    System.out.println(str.contains("ud"));
//
//    //문자열 연결
//    System.out.println(str.concat("s"));
//
//    //문자열을 분리하여 배열로 변환
//    String[] tokens = "010-1234-5678".split("-");
//    System.out.printf("%s %s %s\n",tokens[0],tokens[1],tokens[2]);
//
//    //문자열 앞뒤 공백제거
//    System.out.println(" student  ".length());
//    System.out.println(" student  ".trim().length());
//
//    System.out.println("s".repeat(10));

  }
}
