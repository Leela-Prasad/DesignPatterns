package com.codewithmosh.structural.composite.demo;

public class Shape implements Component{
    @Override
    public void render() {
        System.out.println("Rendering Shape");
    }

    @Override
    public void move() {
        System.out.println("Moving Shape");
    }
}
