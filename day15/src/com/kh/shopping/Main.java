package com.kh.shopping;

import javax.swing.*;
import java.util.Comparator;
import java.util.Set;

public class Main {
  public static void main(String[] args) {
    Product p1 = new Product("TV", 100);
    Product p2 = new Product("냉장고", 300);
    Product p3 = new Product("쇼파", 200);
    Product p4 = new Product("에어컨", 400);
    Product p5 = new Product("세탁기", 250);

    ShoppingBasket shoppingBasket = new ShoppingBasket();
    shoppingBasket.put(p1);
    shoppingBasket.put(p2);
    shoppingBasket.put(p3);
    shoppingBasket.put(p4);
    shoppingBasket.put(p5);
    System.out.println(shoppingBasket);

//    Integer x = 1;  //auto boxing
//    int z = x;      //auto unboxing
//    Integer y = new Integer(1);
//    int z = y.intValue();


    //가격 내림차순 비교연산자
    Comparator<Product> com3 = new Comparator<>() {
      @Override
      public int compare(Product p1, Product p2) {
        //case1)
//        int result = 0;
//        if(p1.getPrice() > p2.getPrice()){
//          result = 1;
//        }else if(p1.getPrice() < p2.getPrice()){
//          result = -1;
//        }
//        return result * -1;
        //case2)
        Integer priceOfp1 = p1.getPrice();
        Integer priceOfp2 = p2.getPrice();
        return priceOfp1.compareTo(priceOfp2) * -1;
      }
    };
    ShoppingBasket shoppingBasket3 = new ShoppingBasket(com3);
    shoppingBasket3.put(p1);
    shoppingBasket3.put(p2);
    shoppingBasket3.put(p3);
    shoppingBasket3.put(p4);
    shoppingBasket3.put(p5);
    System.out.println(shoppingBasket3);


    //상품명 오름차순 비교연산자
    Comparator<Product> com4 = new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {

        return o1.getName().compareTo(o2.getName());

      }
    };
    ShoppingBasket shoppingBasket4 = new ShoppingBasket(com4);
    shoppingBasket4.put(p1);
    shoppingBasket4.put(p2);
    shoppingBasket4.put(p3);
    shoppingBasket4.put(p4);
    shoppingBasket4.put(p5);
    System.out.println(shoppingBasket4);

    //상품명 내림차순 비교연산자
    Comparator<Product> com5 = new Comparator<Product>() {
      @Override
      public int compare(Product o1, Product o2) {
        return o1.getName().compareTo(o2.getName()) * -1;
      }
    };
    ShoppingBasket shoppingBasket5 = new ShoppingBasket(com5);
    shoppingBasket5.put(p1);
    shoppingBasket5.put(p2);
    shoppingBasket5.put(p3);
    shoppingBasket5.put(p4);
    shoppingBasket5.put(p5);
    System.out.println(shoppingBasket5);
  }
}
