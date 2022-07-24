package com.codewithmosh.behavourial.strategy.exercise;

public class ChatClient {
    private EncryptionAlgorithm encryptionAlgorithm;

    public ChatClient(EncryptionAlgorithm encryptionAlgorithm) {
        this.encryptionAlgorithm = encryptionAlgorithm;
    }

    public void send(String message) {
        encryptionAlgorithm.encrypt(message);
        System.out.println("Sending Encrypted Message");
    }
}
