import java.util.Scanner;

public class MaxValue2 {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("<< 3개의 정수값을 입력받아 최대값 구하기 >>");
    System.out.print("정수1 : ");
    int x = Integer.parseInt(scanner.nextLine());
    System.out.print("정수2 : ");
    int y = Integer.parseInt(scanner.nextLine());
    System.out.print("정수3 : ");
    int z = Integer.parseInt(scanner.nextLine());

    int maxValue = x;  //최대값

    if( y > maxValue){
      maxValue = y;
    }
    if( z > maxValue){
      maxValue = z;
    }

    System.out.print("최대값출력");
    System.out.println(maxValue);
  }
}
