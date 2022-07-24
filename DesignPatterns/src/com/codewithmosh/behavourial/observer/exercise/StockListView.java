package com.codewithmosh.behavourial.observer.exercise;

import java.util.ArrayList;
import java.util.List;

public class StockListView implements Observer {
    private List<Stock> stocks = new ArrayList<>();

    public void addStock(Stock stock) {
        stocks.add(stock);
        stock.addObserver(this);
    }

    @Override
    public void update() {
        System.out.println("StockList View");
        for(var stock: stocks)
            System.out.println(stock);
    }
}
