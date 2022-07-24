package com.codewithmosh.structural.adapter.exercise;

import com.codewithmosh.structural.adapter.exercise.Gmail.GmailClient;

public class Main {
    public static void main(String[] args) {
        var emailClient = new EmailClient();
        emailClient.addProvider(new GmailProvider());
        emailClient.downloadEmails();
    }
}
