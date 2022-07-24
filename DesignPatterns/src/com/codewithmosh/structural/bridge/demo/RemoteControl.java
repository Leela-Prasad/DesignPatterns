package com.codewithmosh.structural.bridge.demo;

public class RemoteControl {
    protected Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn() {
        device.turnOn();
    }
    public void turnOff() {
        device.turnOff();
    }
}
