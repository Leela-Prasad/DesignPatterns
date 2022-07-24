package com.codewithmosh.structural.facade.exercise;

public class Main {
    public static void main(String[] args) {
        var service = new TwitterAPI("appKey", "secret");
        service.getRecentTweets();
    }
}
