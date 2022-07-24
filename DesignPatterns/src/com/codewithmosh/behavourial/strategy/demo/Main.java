package com.codewithmosh.behavourial.strategy.demo;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage(new PngCompressor(), new HighContrastFilter());
        imageStorage.store("a.txt");
    }
}
