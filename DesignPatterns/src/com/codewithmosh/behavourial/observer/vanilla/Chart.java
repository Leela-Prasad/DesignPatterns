package com.codewithmosh.behavourial.observer.vanilla;

public class Chart implements Observer {
    @Override
    public void update() {
        System.out.println("Chart is notified");
    }
}
