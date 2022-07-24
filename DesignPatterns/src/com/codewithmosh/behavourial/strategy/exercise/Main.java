package com.codewithmosh.behavourial.strategy.exercise;

public class Main {
    public static void main(String[] args) {
        var chatClient = new ChatClient(new AES());
        chatClient.send("abc");
    }
}
