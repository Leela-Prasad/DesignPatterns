package com.codewithmosh.structural.facade.demo;

public class NotificationService {
    public void send(String message, String target) {
        var server = new NotificationServer();
        var connection = server.connect();
        var authToken = server.authenticate("APP ID", "key");
        server.send(authToken, new Message(message), target);
        connection.disconnect();
    }
}
