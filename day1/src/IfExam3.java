public class IfExam3 {
  public static void main(String[] args) {
    //boolean flag = true;
    int number = 3;

    if(isOdd(number)){
      System.out.println("홀수입니다");
    }else{
      System.out.println("짝수입니다");
    }
  }

  //홀수면 true, 짝수면 false를 반환하는 메소드
  public static boolean isOdd(int num){
    boolean result = false;

    //단순 IF
    if(num % 2 == 1){
      result = true;
    }

    return result;
  }
}
