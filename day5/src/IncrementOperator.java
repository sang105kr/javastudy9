/*
    증감연산자 : 선위 증감 연산자(++i), 후위 증감 연산자(i++)
    - 단독으로 사용될때는 선위,후위 차이가 없다.
    - 증감연산자가 식에 참여할때는 주의
      1. 선위 증감 연산자 : 피연산자를  1증감 시킨후 식에 참여
      2. 후위 증감 연산자 : 피연산자를 식에 참여한후 피연산자를 1증감 시킴.
 */
public class IncrementOperator {
  public static void main(String[] args) {
    int x = 1;
    int y = x++;  // x값을 y에 대입후 x값을 1증가한다
    System.out.println("x="+x+", y="+y);

    int k = 1;
    int l = ++k; // k값을 1증가후 l에 대입한다.
    System.out.println("k="+k+", l="+l);


    int i = 1;
    i++; // i=i+1
    System.out.println("i="+i);

    int j = 1;
    ++j; // j=j+1
    System.out.println("j="+j);
  }
}
