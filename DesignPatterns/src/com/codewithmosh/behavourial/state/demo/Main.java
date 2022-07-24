package com.codewithmosh.behavourial.state.demo;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new Selection());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
