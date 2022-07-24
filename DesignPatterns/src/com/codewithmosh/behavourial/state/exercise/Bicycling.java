package com.codewithmosh.behavourial.state.exercise;

public class Bicycling implements TravelMode {
    @Override
    public Object getEta() {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    @Override
    public Object getDirection() {
        System.out.println("Calculating Direction (bycycling)");
        return 2;
    }
}
