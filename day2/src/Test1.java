public class Test1 {
  public static void method1(){
    System.out.println("method1호출됨!");
    method2();
  }

  public static void method2(){
    System.out.println("method2호출됨!");
    method3(); //재귀호출
  }

  public static void method3(){
    System.out.println("method3호출됨!");
  }

  public static void main(String[] args){
    System.out.println("hello~");
    method1(); //메소드호출
  }
}
