package com.codewithmosh.structural.flyweight.novice;

public class Point {
    private int x; // 4 bytes
    private int y; // 4 bytes
    private PointType pointType; // 4 bytes
    private byte[] icon; // 20 bytes
    // for 1 point 20 bytes let us say 1000 points 20 MB
    // so it will consume 20 MB for rendering map

    public Point(int x, int y, PointType pointType, byte[] icon) {
        this.x = x;
        this.y = y;
        this.pointType = pointType;
        this.icon = icon;
    }

    public void draw() {
        System.out.printf("%s at (%d, %d)", pointType, x, y);
    }
}
