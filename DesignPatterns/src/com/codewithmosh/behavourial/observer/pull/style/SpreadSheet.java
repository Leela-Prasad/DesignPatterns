package com.codewithmosh.behavourial.observer.pull.style;

public class SpreadSheet implements Observer {

    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Spreadsheet is notified:: " + dataSource.getValue());
    }
}
