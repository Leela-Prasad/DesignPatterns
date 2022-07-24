package com.codewithmosh.behavourial.observer.push.style;

public class SpreadSheet implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Spreadsheet is notified: " + value);
    }
}
