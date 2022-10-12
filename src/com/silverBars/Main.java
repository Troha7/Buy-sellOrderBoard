package com.silverBars;

import com.silverBars.orderBoard.LiveOrderBoard;
import com.silverBars.orders.Buy;
import com.silverBars.orders.Sell;

public class Main {

  public static void main(String[] args) {

    LiveOrderBoard.add(new Buy(1, 30000, 25.5));
    LiveOrderBoard.add(new Buy(2, 30000, 62.5));
    LiveOrderBoard.add(new Buy(3, 32550, 44.0));
    LiveOrderBoard.add(new Buy(3, 32550, 15.0));

    LiveOrderBoard.add(new Sell(4, 50070, 20.0));
    LiveOrderBoard.add(new Sell(5, 50070, 40.0));
    LiveOrderBoard.add(new Sell(6, 70025, 40.0));
    LiveOrderBoard.add(new Sell(7, 70025, 40.0));

    LiveOrderBoard.getSumInfo();

  }

}
