package com.silverBars.orderBoard;

import com.silverBars.orders.Buy;
import com.silverBars.orders.Order;
import com.silverBars.orders.Sell;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LiveOrderBoard {

  private final List<Order> orderList = new ArrayList<>();

  public void add(Order order) {
    sumQuantity(order);
    orderList.add(order);
    Collections.sort(orderList);
  }

  private void sumQuantity(Order order) {
    for (Order orderInList : orderList) {
      if (orderInList.compareTo(order) == 0) {
        Double sum = order.getQuantity() + orderInList.getQuantity();
        order.setQuantity(sum);
        orderList.remove(orderInList);
        break;
      }
    }
  }

  public void remove(Order order) {
    orderList.remove(order);
  }

  public void getSumInfo() {
    StringBuilder buyStr = new StringBuilder("Buying >>>>>>>>>>>>>>\n");
    StringBuilder sellStr = new StringBuilder("Selling >>>>>>>>>>>>>>\n");

    for (Order order : orderList) {
      if(order instanceof Buy){
        buyStr.append(order);
      }
      else if(order instanceof Sell){
        sellStr.append(order);
      }
    }

    System.out.println(buyStr.append(sellStr));
  }

}
