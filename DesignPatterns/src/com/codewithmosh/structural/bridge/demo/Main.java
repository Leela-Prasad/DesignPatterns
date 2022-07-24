package com.codewithmosh.structural.bridge.demo;

public class Main {
    public static void main(String[] args) {
        var remote = new RemoteControl(new LGTV());
        remote.turnOn();
    }
}
