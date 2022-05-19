import java.util.Scanner;

public class Gugudan {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println(">> 구구단을 출력하는 프로그램 <<");

    while(true) {
      
      System.out.print("출력하고자하는 구구단을 입력하세요 [Q]:종료  >> ");
      String input = scanner.nextLine(); //키보드로부터 엔터칠때까지 입력된 값을 문자열로 반환
      
      if (input.equals("Q")) { //문자열비교 equals()사용
        System.out.println("종료!");
        break; // break문에서 가장 가까운 반복문을 빠져나온다.
      }

      int gugudan = Integer.parseInt(input); //문자열을 정수로 변환

      for (int i = 1; i <= 9; i++) {
        System.out.println( gugudan + " * " + i + " = " + (gugudan * i));
      }

    }
  }
}
