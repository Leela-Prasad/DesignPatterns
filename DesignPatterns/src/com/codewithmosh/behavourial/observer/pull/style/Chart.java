package com.codewithmosh.behavourial.observer.pull.style;

public class Chart implements Observer {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart is notified:: " + dataSource.getValue());
    }
}
