package com.codewithmosh.behavourial.strategy.exercise;

public class DES implements EncryptionAlgorithm {
    @Override
    public void encrypt(String message) {
        System.out.println("Encryption Using DES");
    }
}
