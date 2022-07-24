package com.codewithmosh.structural.flyweight.novice;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var service = new PointService();
        List<Point> points = service.getPoints();
        for(Point point: points)
            point.draw();
    }
}
