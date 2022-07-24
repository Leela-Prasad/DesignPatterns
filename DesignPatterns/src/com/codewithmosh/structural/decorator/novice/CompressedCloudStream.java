package com.codewithmosh.structural.decorator.novice;

public class CompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        String compressedData = data.substring(0,5);
        super.write(compressedData);
    }
}
