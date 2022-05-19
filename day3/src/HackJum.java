public class HackJum {
  public static void main(String[] args) {
    int kor  = 82; //국어점수
    int eng  = 73; //영어점수
    int math = 65; //수학점수
    
    int sum = 0;  //총점
    double average = 0.0; //평균

    sum = kor + eng + math;
    //case1)
    //average = (double)sum / 3;
    //case2)
    //average = sum / (double)3;
    //case3)
    average = sum / (3 * 1.0);
    System.out.println("총점 = " + sum);
    System.out.println("평균 = " + average);
  }
}
