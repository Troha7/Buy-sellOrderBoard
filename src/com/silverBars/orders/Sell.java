package com.silverBars.orders;

public class Sell extends Order {

  public Sell(Integer userId, Integer price, Double quantity) {
    super(userId, price, quantity);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public int compareTo(Order o) {
    return super.getPrice() - o.getPrice();
  }

}
