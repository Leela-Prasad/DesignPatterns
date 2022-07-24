package com.codewithmosh.behavourial.observer.vanilla;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet is notified");
    }
}
