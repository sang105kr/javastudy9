package com.kh.exam2;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/*
  checked exception : 컴파일 시점에 반드시 예외처리해야하는 예외
 */
public class CheckedException {
  public static void main(String[] args) throws Exception{
    //1
    Thread.sleep(1000);

    //2
    Class cls = Class.forName("java.lang.Object");

    //3
    InputStreamReader in = new InputStreamReader(System.in);
    in.read();

    //4
    FileInputStream fis = new FileInputStream("text.txt");

    //5
    A a1 =new A();
    A a2 = (A) a1.clone();

  }
}
