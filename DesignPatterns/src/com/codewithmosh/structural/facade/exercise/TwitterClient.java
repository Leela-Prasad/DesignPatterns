package com.codewithmosh.structural.facade.exercise;

import java.util.ArrayList;
import java.util.List;

public class TwitterClient {
    public List<Tweet> getRecentTweets(String accessToken) {
        System.out.println("Getting Recent Tweets");
        return new ArrayList<>();
    }
}
