package com.codewithmosh.structural.flyweight.demo;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        List<Point> points = service.getPoints();
        for(Point point: points)
            point.draw();
    }
}
