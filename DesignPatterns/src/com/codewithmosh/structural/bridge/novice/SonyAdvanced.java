package com.codewithmosh.structural.bridge.novice;

public class SonyAdvanced extends AdvancedRemoteControl {
    @Override
    public void setChannel(int number) {
        System.out.println("Sony: Set Channel");
    }

    @Override
    public void turnOn() {
        System.out.println("Sony: Turn On");
    }

    @Override
    public void turnOff() {
        System.out.println("Sony: Turn Off");
    }
}
