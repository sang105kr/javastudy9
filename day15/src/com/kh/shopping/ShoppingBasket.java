package com.kh.shopping;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class ShoppingBasket {
  private Set<Product> basket;

  public ShoppingBasket(){
    this.basket = new TreeSet<>();
  }

  public ShoppingBasket(Comparator comparator){
    this.basket = new TreeSet<>(comparator);
  }

  public void put(Product product){
    this.basket.add(product);
  }

  @Override
  public String toString() {
    return "장바구니 : " + basket;
  }
}
