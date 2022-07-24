package com.codewithmosh.structural.decorator.novice;

public class EncryptedCloudStream extends CloudStream{
    @Override
    public void write(String data) {
        String encryptedData = "!&^(**(&%$%#%";
        super.write(encryptedData);
    }
}
