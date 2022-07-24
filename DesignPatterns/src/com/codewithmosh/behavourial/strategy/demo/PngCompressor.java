package com.codewithmosh.behavourial.strategy.demo;

public class PngCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing Using Png");
    }
}
