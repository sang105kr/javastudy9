package com.kh.exam1;

import java.util.Objects;

public class Coin {
  private int value;

  public Coin(int value) {
    this.value = value;
  }

  public int getValue() {
    return value;
  }

  @Override
  public String toString() {
    return "Coin{" +
        "value=" + value +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Coin coin = (Coin) o;
    return value == coin.value;
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }
}
