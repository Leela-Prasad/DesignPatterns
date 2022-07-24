package com.codewithmosh.structural.adapter.exercise;

import com.codewithmosh.structural.adapter.exercise.Gmail.GmailClient;

public class GmailProvider implements EmailProvider {
    private GmailClient gmailClient = new GmailClient();

    @Override
    public void downloadEmails() {
        gmailClient.connect();
        gmailClient.getEmails();
        gmailClient.disconnect();
    }
}
