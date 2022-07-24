package com.codewithmosh.structural.decorator.demo;

public class Encrypted implements Stream {
    private Stream stream;

    public Encrypted(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        String encryptedData = "!&^(**(&%$%#%";
        stream.write(encryptedData);
    }
}
