import java.util.Scanner;

public class HackJum5 {
  public static void main(String[] args) {

    boolean stop = false;
    System.out.println("<< 3개의 과목을 입력받아 총점/평균 구하는 프로그램 >>");

    while(!stop) {
      int kor  = inputValue("국어"); //국어점수
      if(kor == -1) {
        stop = true;
        continue;
      }
      int eng  = inputValue("영어"); //영어점수
      if(eng == -1) {
        stop = true;
        continue;
      }
      int math = inputValue("수학"); //수학어점수
      if(math == -1) {
        stop = true;
        continue;
      }

      int sum = 0;  //총점
      double average = 0.0; //평균

      sum = total(kor, eng, math);
      average = getAverage(sum, 3);

      System.out.println("총점 = " + sum);
      System.out.println("평균 = " + average);
    }
  }

  public static int inputValue(String title){
    Scanner scanner = new Scanner(System.in);
    System.out.print(title + " 점수 >> ");
    String input = scanner.nextLine();

    int score = 0;
    if(input.equals("Q") || input.equals("q")){
      score = -1;
    }else{
      score = Integer.parseInt(input);
    }
    return score;
  }

  //3과목의 합계
  public static int total(int kor, int eng, int math) {
//    return kor + eng + math;
    int result = kor + eng + math;
    return result;
  }
  //평균구하기
  public static double getAverage(int total, int count){
      return total / (double)count;
  }
}
