public class Test2 {
  public static void main(String[] args) {
    System.out.println("hello!");
    System.out.println("hello2!");
    System.out.println("hello3!");

    int number; //정수형 변수 선언
    //System.out.println(number);

    number = 10; //값 할당 (초기화 : 변수선언후 최초값 할당)
    System.out.println(number);

    number = 20; //값 재할당
    System.out.println(number);

    int number2 = 30;  //변수선언 + 초기화

    int number3 = number + number2; //변수선언 + 초기화(연산식)
    System.out.println(number3);

    int number4 = multiply(number2,number3);//변수선언 + 초기화(메소드)
    System.out.println(number4);
  }

  //  public static 반환타입 메소드이름(매개변수){
//    실행문;
//  }
  public static int multiply(int num1, int num2) {
//    return num1 * num2;
    int result = num1 * num2;
    return result;
  }


}
