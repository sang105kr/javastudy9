package com.kh.exam5;

import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapExam1 {
  public static void main(String[] args) {
    TreeMap<Integer, String> scores = new TreeMap<>();
    scores.put(87, "홍길동1");
    scores.put(98, "홍길동2");
    scores.put(75, "홍길동3");
    scores.put(95, "홍길동4");
    scores.put(80, "홍길동5");
    System.out.println(scores);

    Map.Entry<Integer, String> entry = scores.firstEntry();
    System.out.println(entry.getKey() + ":" + entry.getValue());

    entry = scores.lastEntry();
    System.out.println(entry.getKey() + ":" + entry.getValue());

    entry = scores.higherEntry(95);
    System.out.println(entry.getKey() + ":" + entry.getValue());

    entry = scores.lowerEntry(95);
    System.out.println(entry.getKey() + ":" + entry.getValue());

    entry = scores.ceilingEntry(95);
    System.out.println(entry.getKey() + ":" + entry.getValue());

    entry = scores.floorEntry(95);
    System.out.println(entry.getKey() + ":" + entry.getValue());

//    while (!scores.isEmpty()) {
//      entry = scores.pollFirstEntry();
//      System.out.println(entry.getKey() + ":" + entry.getValue() + ":" + scores.size());
//    }

    //검색
    SortedMap<Integer, String> subMap = scores.subMap(80, 90);
    System.out.println(subMap);
    NavigableMap<Integer, String> subMap2 = scores.subMap(80, false, 90, false);
    System.out.println(subMap2);

    System.out.println(scores.headMap(80,true));
    System.out.println(scores.tailMap(80,false));

    //맵을 내림차순하여 정렬된 객체반환
    System.out.println(scores.descendingMap());
    //맵의 키를 내림차순하여 정렬된 객체반환
    System.out.println(scores.descendingKeySet());
  }
}
