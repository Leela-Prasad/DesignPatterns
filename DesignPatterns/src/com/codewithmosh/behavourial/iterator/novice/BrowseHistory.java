package com.codewithmosh.behavourial.iterator.novice;

import java.util.ArrayList;
import java.util.List;

public class BrowseHistory {
    private List<String> urls = new ArrayList<>();

    public void push(String url) {
        urls.add(url);
    }

    public String pop() {
        var lastIndex = urls.size() - 1;
        return urls.remove(lastIndex);
    }

    public List<String> getUrls() {
        return urls;
    }
}
