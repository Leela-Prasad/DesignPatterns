package com.codewithmosh.structural.decorator.novice;

public class EncryptedAndCompressedCloudStream extends CloudStream {
    @Override
    public void write(String data) {
        // do encrypt and compress
        String result = "";
        super.write(data);
    }
}
