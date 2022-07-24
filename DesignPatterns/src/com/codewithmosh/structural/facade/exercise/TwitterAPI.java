package com.codewithmosh.structural.facade.exercise;

import java.util.List;

public class TwitterAPI {
    private String appKey;
    private String secret;

    public TwitterAPI(String appKey, String secret) {
        this.appKey = appKey;
        this.secret = secret;
    }

    public List<Tweet> getRecentTweets() {
        var client = new TwitterClient();
        return client.getRecentTweets(getAccessToken());
    }

    private String getAccessToken() {
        var oauth = new OAuth();
        var requestToken = oauth.requestToken(appKey, secret);
        var accessToken = oauth.getAccessToken(requestToken);
        return accessToken;
    }
}
