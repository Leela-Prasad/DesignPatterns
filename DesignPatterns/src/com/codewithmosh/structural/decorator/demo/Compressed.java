package com.codewithmosh.structural.decorator.demo;

public class Compressed implements Stream {
    private Stream stream;

    public Compressed(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String compressedData = data.substring(0,5);
        stream.write(compressedData);
    }
}
