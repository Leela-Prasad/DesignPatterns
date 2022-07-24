package com.codewithmosh.behavourial.state.demo;

public class Selection implements Tool {

    @Override
    public void mouseDown() {
        System.out.println("Selection Icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed Rectangle");
    }
}
