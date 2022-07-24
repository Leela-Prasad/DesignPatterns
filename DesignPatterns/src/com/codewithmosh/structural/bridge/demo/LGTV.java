package com.codewithmosh.structural.bridge.demo;

public class LGTV implements Device {
    @Override
    public void turnOn() {
        System.out.println("LG: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("LG: Turn Off");
    }

    @Override
    public void setChannel(int number) {
        System.out.println("LG: Set Channel");
    }
}
