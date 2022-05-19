public class SwitchScore {
  public static void main(String[] args) {
    int score = 100;

    //유효성체크
    if ( !(score >= 0 && score <= 100)) {
      System.out.println("점수 유효범위(0~100)를 초과합니다.");
      return;
    }

    int result = score / 10;

//    System.out.println(67 / 10);
    switch(result){
      case 10: // 100점
      case 9:  // 90~99점
        System.out.println("A학점");
        break;
      case 8:  // 80~89점
        System.out.println("B학점");
        break;
      case 7:  // 70~79점
        System.out.println("C학점");
        break;
      case 6:  // 60~69점
        System.out.println("D학점");
        break;
      default: // 60미만
        System.out.println("F학점");
    }
  }
}
