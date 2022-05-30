package com.kh.shopping;

import java.util.Comparator;

public class Product implements Comparable {
  private String name;
  private int price;

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }

  public String getName() {
    return name;
  }

  public int getPrice() {
    return price;
  }

  @Override
  public int compareTo(Object o) {
    int result = 0;
    Product p = (Product)o;
    return Integer.valueOf(this.getPrice()).compareTo(Integer.valueOf(p.getPrice()));

//    if(this.getPrice() > p.getPrice()){
//      result = 1;
//    } else if (this.getPrice() < p.getPrice()) {
//      result = -1;
//    }
//    return result;

  }
}
