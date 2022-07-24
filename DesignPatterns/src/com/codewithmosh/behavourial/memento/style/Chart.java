package com.codewithmosh.behavourial.memento.style;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart is notified");
    }
}
