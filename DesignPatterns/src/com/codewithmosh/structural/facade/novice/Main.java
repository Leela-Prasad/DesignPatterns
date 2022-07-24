package com.codewithmosh.structural.facade.novice;

public class Main {
    public static void main(String[] args) {
        var server = new NotificationServer();
        var connection = server.connect();
        var authToken = server.authenticate("APP ID", "key");
        var message = new Message("Hello World");
        server.send(authToken, message, "target");
        connection.disconnect();
    }
}
