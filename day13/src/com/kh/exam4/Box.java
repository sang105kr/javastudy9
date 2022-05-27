package com.kh.exam4;

public class Box<T> {
  private T data;

  public Box(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public void setData(T data) {
    this.data = data;
  }
}
