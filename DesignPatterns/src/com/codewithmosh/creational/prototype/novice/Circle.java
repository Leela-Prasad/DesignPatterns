package com.codewithmosh.creational.prototype.novice;

public class Circle implements Component {
    private int radius;

    @Override
    public void render() {
        System.out.println("Rendering Circle");
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
