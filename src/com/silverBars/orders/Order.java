package com.silverBars.orders;

public abstract class Order implements Comparable<Order> {

  private final Integer userId;
  private final Integer price;
  private Double quantity;

  public Order(Integer userId, Integer price, Double quantity) {
    this.userId = userId;
    this.price = price;
    this.quantity = quantity;
  }

  private String penceToPound() {
    int pounds = price / 100;
    int pences = price % 100;
    return pounds + "." + pences;
  }

  @Override
  public String toString() {
    return quantity + " kg for £" + penceToPound() + "\n";
  }

  public Integer getPrice() {
    return price;
  }

  public Double getQuantity() {
    return quantity;
  }

  public void setQuantity(Double quantity) {
    this.quantity = quantity;
  }
}
