public class ForExam {
  public static void main(String[] args) {
    int sum = 0;

//    for(초기값; 조건식; 증감식){
//      실행문;
//    }
    // 1씩 증가하는 표현식
    // i = i + 1 , i += 1, i++ , ++i
    for(int i = 1; i <= 100; i++ ) {

      if( i % 2 == 0) {
        sum += i;  // sum = sum + i;
      }

    }

    System.out.println(sum);
  }
}
