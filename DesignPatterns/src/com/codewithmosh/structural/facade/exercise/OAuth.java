package com.codewithmosh.structural.facade.exercise;

public class OAuth {
    public String requestToken(String appKey, String secret) {
        return "requestToken";
    }
    public String getAccessToken(String requestToken) {
        return "accessToken";
    }
}
