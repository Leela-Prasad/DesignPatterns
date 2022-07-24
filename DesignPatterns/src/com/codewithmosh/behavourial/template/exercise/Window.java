package com.codewithmosh.behavourial.template.exercise;

public class Window {
    protected void onClosing() {}

    public void close() {
        onClosing();
        System.out.println("Removing the Window from the screen");
        onClosed();
    }

    protected void onClosed() {}
}
