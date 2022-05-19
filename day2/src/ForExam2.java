import java.util.Scanner;

public class ForExam2 {
  public static void main(String[] args) {

    System.out.println(">> 구구단 출력하기 <<");
    Scanner scanner = new Scanner(System.in);
    System.out.print("출력할 구구단 : ");
    int gugudan = Integer.parseInt(scanner.nextLine());

    // i++, ++i, i=i+1, i+=1
    for (int i = 1; i < 10; i++) {
      System.out.println(gugudan + "*" + i + "=" + (gugudan * i));
    }
  }
}
