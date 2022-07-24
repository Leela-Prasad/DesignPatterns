package com.codewithmosh.structural.decorator.demo;

public class CloudStream implements Stream {
    @Override
    public void write(String data) {
        System.out.println("Storing " + data);
    }
}
