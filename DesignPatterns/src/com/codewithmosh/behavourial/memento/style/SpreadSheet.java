package com.codewithmosh.behavourial.memento.style;

public class SpreadSheet implements Observer {
    @Override
    public void update() {
        System.out.println("Spreadsheet is notified");
    }
}
