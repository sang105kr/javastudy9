public class SumOfOneToTen {
  public static void main(String[] args) {
    final int NUMBER = 100;
    System.out.println("[for문] 1~" + NUMBER + "10합 = " + sumByFor(NUMBER));
    System.out.println("[while문] 1~" + NUMBER + "10합 = " + sumByWhile(NUMBER));
    System.out.println("[do~while문] 1~10" + NUMBER + "합 = " + sumByDoWhile(NUMBER));
  }
  //for
  public static int sumByFor(int end){
    int sum = 0;
    for (int i = 1; i <= end; i++) {
      sum += i;
    }
    return sum;
  }
  public static int sumByWhile(int end){
    int sum = 0;
    int i = 1;
    while ( i <= end ) {
      sum += i;
      i++;
    }
    return sum;
  }
  public static int sumByDoWhile(int end){
    int sum = 0;
    int i = 1;
    do {
      sum += i;
      i++;
    }while ( i <= end );
    return sum;
  }
}
