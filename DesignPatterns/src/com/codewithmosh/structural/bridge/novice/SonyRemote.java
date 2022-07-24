package com.codewithmosh.structural.bridge.novice;

public class SonyRemote extends RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("Sony: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn Off");
    }
}
