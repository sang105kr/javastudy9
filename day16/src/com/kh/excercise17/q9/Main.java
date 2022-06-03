package com.kh.excercise17.q9;

import java.util.Stack;

public class Main {
  public static void main(String[] args) {
    Stack<Double> stack = new Stack<>();

    stack.push(new Double(1.1));
    stack.push(2.2);
    stack.pop();
    stack.push(3.3);
    stack.push(4.4);

    System.out.println(stack.search(1.1));
    System.out.println(stack.search(2.2));
    System.out.println(stack.search(3.3));
    System.out.println(stack.search(4.4));
  }
}
