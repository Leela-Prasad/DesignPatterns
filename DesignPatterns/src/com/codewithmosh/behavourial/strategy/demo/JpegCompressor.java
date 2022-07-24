package com.codewithmosh.behavourial.strategy.demo;

public class JpegCompressor implements Compressor {
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing Using Jpeg");
    }
}
