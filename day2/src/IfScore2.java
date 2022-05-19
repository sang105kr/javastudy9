import java.util.Scanner;

public class IfScore2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("<< 학점 구하기 >> 'Q' 를 입력하면 종료합니다.");

    boolean stop = false;

    while(!stop) {
      System.out.print("점수를 입력하세요 : ");
      String input = scanner.nextLine(); //콘솔에 입력된 라인을 문자열로 반환

      if(input.equals("Q")){
        System.exit(0); //프로그램 종료
      }
      
      int score = Integer.parseInt(input);  //문자열을 정수로 변환

      if (score < 0 || score > 100) {
        System.out.println("점수입력 오류(0~100 범위의 값만 유효합니다.)");
        //return;  //메소드 실행을 중지하고 빠져나온다.
        continue;
      }

      if (score >= 90 && score <= 100) {
        System.out.println("A학점");
      } else if (score >= 80 && score <= 89) {
        System.out.println("B학점");
      } else if (score >= 70 && score <= 79) {
        System.out.println("C학점");
      } else if (score >= 60 && score <= 69) {
        System.out.println("D학점");
      } else {
        System.out.println("F학점");
      }
    }
  }
}
