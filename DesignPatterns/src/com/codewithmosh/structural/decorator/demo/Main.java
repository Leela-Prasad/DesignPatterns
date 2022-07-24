package com.codewithmosh.structural.decorator.demo;

public class Main {
    public static void main(String[] args) {
        var stream = new Encrypted(new Compressed(new CloudStream()));
        stream.write("Information");
    }
}
