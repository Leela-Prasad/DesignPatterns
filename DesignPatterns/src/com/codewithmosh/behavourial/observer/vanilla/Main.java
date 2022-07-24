package com.codewithmosh.behavourial.observer.vanilla;

public class Main {
    public static void main(String[] args) {
        var sheet1 = new SpreadSheet();
        var sheet2 = new SpreadSheet();
        var chart = new Chart();

        var datasource = new DataSource();
        datasource.addObserver(sheet1);
        datasource.addObserver(sheet2);
        datasource.addObserver(chart);

        datasource.setValue(2);

    }
}
