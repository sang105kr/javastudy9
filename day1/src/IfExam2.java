public class IfExam2 {
  public static void main(String[] args){
    int score = 80;

    //다중 if문 : 다중 분기
    if(score >= 90){
      System.out.println("A");
    }else if(score >=80 ){
      System.out.println("B");
    }else if(score >= 70){
      System.out.println("C");
    }else{
      System.out.println("F");
    }
  }
}
