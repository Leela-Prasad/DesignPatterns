package com.codewithmosh.structural.facade.demo;

public class NotificationServer {
    public Connection connect() {
        return new Connection();
    }

    public void send(AuthToken authToken, Message message, String target) {
        System.out.println("Sending Message");
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

}
