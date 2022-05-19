public class SumOfOneToTen2 {
  public static void main(String[] args) {
    final int NUMBER = 100;
    System.out.println("[while문] 1~" + NUMBER + "10합 = " + sumByWhile(NUMBER));
    System.out.println("[do~while문] 1~10" + NUMBER + "합 = " + sumByDoWhile(NUMBER));
  }

  public static int sumByWhile(int end){
    int sum = 0;
    int count = 0;
    boolean stop = false;
    while (!stop) {
//      count++;
//      sum += count;
      sum += ++count;
      if(count == end){
        stop = true;
        continue;
      }
      //실행문;;
    }
    return sum;
  }
  public static int sumByDoWhile(int end){
    int sum = 0;
    int count = 0;
    boolean stop = false;
    do {
//      count++;
//      sum += count;
      sum += ++count;  // sum = sum + (++count);
      if(count == end){
        stop = true;
        continue;
      }
      //실행문;;
    }while (!stop);
    return sum;
  }
}
