package com.kh.dic2;

import java.util.*;

/**
 * 단어장
 */
public class Dictionary extends TreeMap<String,String> {
  private static Dictionary dic = new Dictionary();
  private static final int WORD_CPAPCITY = 5; // 단어 최대 저장 갯수
  
  private Dictionary(){
    super();
  }

  public static Dictionary getInstance() {
    return dic;
  }

  /**
   * 저장
   * @param word  단어  
   * @param meaning 의미
   */
  public void save(String word, String meaning) {
    //1)단어수 초과체크
    if(dic.size() == WORD_CPAPCITY){
      throw new DictionaryException("최대 단어수 초과!");
    }
    //2)중복체크
    if(dic.containsKey(word)){
      throw new DictionaryException("이미 등록 되었습니다!");
    }
    dic.put(word, meaning);
  }
  
  /**
   * 검색
   * @param word 단어
   * @return 검색결과
   */
  public Map<String,String> findByWord(String word) {
    Map<String, String> map = new HashMap<>();

      String meaing = dic.get(word);
      //1)일치하는 단어를 검색했을경우
      if(meaing != null){
        map.put(word,meaing);
      }else{
        //2)일치하는 단어가 검색되지 않을경우 즉,,범위검색
        char firstLetter = word.charAt(0);  //'s'
        char nextLetter = (char)(word.charAt(0) + 1); //'t'
        map = dic.subMap(word, true, String.valueOf(nextLetter), false);
    }
    return map;
  }

  /**
   * 수정
   * @param word  단어
   * @param meaning 의미
   */
  public void update(String word, String meaning) {

    if(dic.replace(word, meaning) == null){
      throw new DictionaryException("단어를 검색할 수 없습니다.");
    }
    System.out.println("단어를 수정 하였습니다.");
  }

  /**
   * 삭제
   * @param word
   */
  public void del(String word) {
    if(dic.remove(word) == null){
      throw new DictionaryException("단어를 검색할 수 없습니다.");
    }
    System.out.println("단어를 삭제 하였습니다.");
  }

  /**
   * 목록
   * @param subMenu 서브메뉴 : 1.오름차순 2.내림차순
   * @return 전체단어목록
   */
  public Map<String,String> listAll(String subMenu){
    Map<String, String> map = new HashMap<>();

    switch (subMenu) {
      case "1": //오름차순
        map = dic;
        break;
      case "2": //내림차순
        map = dic.descendingMap();
        break;
    }

    return map;
  }

  //

  /**
   * 색인
   * @param letter 한문자 초성
   * @return 초성으로 시작하는 단어 반환
   */
  public List<String> index(String letter) {
    //다음 문자 계산하기
    char nextLetter = (char)(letter.charAt(0) + 1);
    NavigableMap<String, String> subMap = dic.subMap(letter, true, String.valueOf(nextLetter), false);

    //단어만 추출
    Set<String> words = subMap.keySet();

    // set => list에 옮겨담기
    List<String> list = new ArrayList<>();
    for (String word: words) {
      list.add(word);
    }
    return list;
//    return new ArrayList<>(subMap.keySet());
  }


  /**
   * 통계
   * @return 1.저장된 단어의 갯수 2.단어의 문자수가 가장 많은 단어
   *         3.단어 글자수 내림차순 출력(단어만)
   */
  public String showWordStatics(){
    String info = "";

    info += "1.저장된 단어의 갯수 : " + dic.size() + "\n";
    info += "2.단어의 문자수가 가장 많은 단어 : " + getMostCharactorCount() + "\n";
    info += "3.단어 글자수 내림차순 출력(단어만) : " + decendingByLengthOfWord() + "\n";

    return info;
  }

  //단어의 글자수가 가장 많은 단어 , 이름있는 비교연산자
  private String decendingByLengthOfWord() {
    String str = "";
    TreeMap<String, String> map = new TreeMap<>(new Comparator<String>() {
      @Override
      public int compare(String o1, String o2) {
        int result = 1;
        if(o1.length() > o2.length()){
          result = -1;
        }else if(o1.length() < o2.length()){
          result = 1;
        }
        return result;
      }
    });
    map.putAll(dic);

    Set<String> words = map.keySet();
    int size = words.size();
    int cnt = 0;
    for (String word : words) {
      ++cnt;
      if(cnt == size) {  //마지막 단어는 콤마(,)없이 출력
        str += word;
      }else {
        str += word + ",";
      }
    }
    return str;
  }

  //단어의 글자수가 가장 많은 단어,  익명 비교연산자
  private String decendingByLengthOfWord2() {
    String str = "";
    TreeMap<String, String> map = new TreeMap<>(new DecendingByLengthOfWord());
    map.putAll(dic);
    Set<String> words = map.keySet();

    int size = words.size();
    int cnt = 0;
    for (String word : words) {
      ++cnt;
      if(cnt == size) {  //마지막 단어는 콤마(,)없이 출력
        str += word;
      }else {
        str += word + ",";
      }
    }
    return str;
  }

  //단어 글자수 내림차순 출력(단어만)
  private String getMostCharactorCount() {
    String str = "";
    TreeMap<String, String> map = new TreeMap<>(new DecendingByLengthOfWord());
    map.putAll(dic);
    return map.firstKey();
  }

  static class DecendingByLengthOfWord implements Comparator<String>{
    @Override
    public int compare(String o1, String o2) {
      int result = 1;
      if(o1.length() > o2.length()){
        result = -1;
      }else if(o1.length() < o2.length()){
        result = 1;
      }
      return result;
    }
  }

  //초기값
  public void init(){
    dic.put("student", "학생");
    dic.put("teacher", "교사");
    dic.put("classroom", "교실");
    dic.put("smart", "현명한");
    dic.put("lunch", "점심");
  }

  //비우기
  public void clearAll(){
    dic.clear();
  }

}
