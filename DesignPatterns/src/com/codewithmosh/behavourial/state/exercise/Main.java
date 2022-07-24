package com.codewithmosh.behavourial.state.exercise;

public class Main {
    public static void main(String[] args) {
        var service = new DirectionService();
        service.setTravelMode(new Bicycling());
        service.getEta();
        service.getDirection();
    }
}
