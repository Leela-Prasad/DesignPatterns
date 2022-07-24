package com.codewithmosh.behavourial.strategy.novice;

public class Main {
    public static void main(String[] args) {
        var imageStorage = new ImageStorage("png", "b&w");
        imageStorage.store("a.txt");
    }
}
