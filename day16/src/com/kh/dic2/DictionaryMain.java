package com.kh.dic2;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class DictionaryMain {
  public static void main(String[] args) {
    Dictionary dic = Dictionary.getInstance();
    Scanner scanner = new Scanner(System.in);
    boolean stop = false;

    while (!stop) {
      try {
        String word = "";    //단어
        String meaning = ""; //의미
        Map<String, String> list = null; //목록

        System.out.println("1.저장 2.검색 3.수정 4.삭제 5.목록 6.색인 7.통계 8.종료 9.초기화 10.비우기");
        System.out.print("선택 >> ");
        String menu = scanner.nextLine();
        switch (menu) {
          case "1": //저장
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            System.out.print("의미 입력 : ");
            meaning = scanner.nextLine();
            dic.save(word,meaning);
            break;
          case "2": //검색
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            list = dic.findByWord(word);
            if(list.size() == 0 ){
              System.out.println("단어를 검색할 수 없습니다");
              continue;
            }
            if(!list.containsKey(word)){
              System.out.println("일치하는 단어가 없습니다!");
            }
            printList(list);
            break;
          case "3": //수정
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            System.out.print("의미 입력 : ");
            meaning = scanner.nextLine();
            dic.update(word,meaning);
            break;
          case "4": //삭제
            System.out.print("단어 입력 : ");
            word = scanner.nextLine();
            dic.del(word);
            break;
          case "5": //목록
            System.out.println("1.오름차순 2.내림차순");
            System.out.print("선택 >> ");
            String submenu = scanner.nextLine();
            switch (submenu) {
              case "1":
              case "2":
                list = dic.listAll(submenu);
                if(list.size() == 0 ){
                  System.out.println("저장된 단어가 없습니다.");
                  continue;
                }
                // entrySet(), keyset(), values()
                //case 1)
  //              for (Map.Entry<String,String> entry : list.entrySet() ) {
  //                String key = entry.getKey();
  //                String value = entry.getValue();
  //                System.out.println(key + ":" + value);
  //              }
                //case 2)
                printList(list);
                break;
            }
            break;
          case "6": //색인
            System.out.print("색인 입력 : ");
            String letter = scanner.nextLine();
            List<String> words = dic.index(letter);
            for (String str:  words) {
              System.out.print(str + "\t");
            }
            System.out.println();
            break;
          case "7": //통계
            System.out.println(dic.showWordStatics());
            break;
          case "8": //종료
            System.out.println("프로그램 종료!");
            stop = true;
            continue;
          case "9": //초기값
            dic.init();
            break;
          case "10": //비우기
            dic.clearAll();
            break;
          default:
            System.out.println("잘못된 메뉴 선택!");
        } //end of switch
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    } //end of while
  } // end of main

  private static void printList(Map<String, String> list) {
    for (String key : list.keySet() ) {
      String value = list.get(key);
      System.out.println(key + " : " + value);
    }
  }
} // end of class
