import java.util.Arrays;

public class ArrayTest8 {
  public static void main(String[] args) {

    int[] x = new int[]{1,2,3};
    int i;
    for (i = 0; i < x.length; i++) {
      System.out.println(x[i]);
    }
    System.out.println(Arrays.toString(x));
  }
}
