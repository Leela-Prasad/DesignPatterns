package com.codewithmosh.behavourial.template.exercise;

public class ChatWindow extends Window {
    @Override
    protected void onClosed() {
        System.out.println("Disconnecting from Server...");
    }
}
