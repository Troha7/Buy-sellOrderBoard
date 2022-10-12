package com.silverBars.orders;

public class Buy extends Order{

  public Buy(Integer userId, Integer price, Double quantity) {
    super(userId, price, quantity);
  }

  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public int compareTo(Order o) {
    return o.getPrice() - super.getPrice();
  }
}
