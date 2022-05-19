/*
  소스파일 : Hello2.java
  중간코드 : Hello2.class
  작성자 : 홍길동
  작성일 : 2020.05.10
 */
public class Hello2 {
  // 두개 변수의 합구하기
  public static void main(String[] args){
    int x = 10;
    int y = 20;
    int sum = x / y; //산술연산자 : +,-,*(곱하기),/(나누기)
    System.out.println(sum);

    double result = devide(30,5);
    System.out.println("1.main메소드에서 출력 :" + result);

    double result2 = devide(100,10);
    System.out.println("2.main메소드에서 출력 :" + result2);
  }

  public static double devide(double x, double y){
    //System.out.println(x/y);
    double result = x / y;

    return result;
  }

}
