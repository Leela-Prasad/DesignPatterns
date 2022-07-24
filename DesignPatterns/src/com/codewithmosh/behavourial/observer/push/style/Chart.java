package com.codewithmosh.behavourial.observer.push.style;

public class Chart implements Observer {
    @Override
    public void update(int value) {
        System.out.println("Chart is notified: " + value);
    }
}
