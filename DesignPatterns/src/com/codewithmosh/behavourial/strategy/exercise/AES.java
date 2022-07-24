package com.codewithmosh.behavourial.strategy.exercise;

public class AES implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println("Encryption Using AES");
    }
}
