public class MaxValue {
  public static void main(String[] args) {
    int x = 5;
    int y = 7;
    int z = 4;

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
