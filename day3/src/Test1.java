/*
   변수와, 상수변수의 차이점과 용도
 */
public class Test1 {
  public static void main(String[] args) {
    int x;  //변수 선언
    x = 10; //값 할당 , 초기화

    x = 20; // 값 재할당.
    System.out.println("x="+x);

    final int Y; //상수 변수 선언
    Y = 30; //값 할당, 초기화
    System.out.println("Y="+Y);

   // Y = 40; //상수 변수는 값을 재할당 할수 없다.
  }
}
