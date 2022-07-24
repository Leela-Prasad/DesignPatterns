package com.codewithmosh.behavourial.observer.exercise;

public class Main {
    public static void main(String[] args) {
        var stock1 = new Stock("stock1", 10.2f);
        var stock2 = new Stock("stock2", 20.2f);
        var stock3 = new Stock("stock3", 30.2f);


        var statusBar = new StatusBar();
        var stockList = new StockListView();

        statusBar.addStock(stock1);
        statusBar.addStock(stock2);

        stockList.addStock(stock1);
        stockList.addStock(stock2);
        stockList.addStock(stock3);

        stock2.setPrice(22.2f);
        stock3.setPrice(33.3f);

    }
}
