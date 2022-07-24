package com.codewithmosh.creational.prototype.demo;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        circle1.setRadius(5);

        var menu = new ContextMenu();
        menu.duplicate(circle1);

    }
}
