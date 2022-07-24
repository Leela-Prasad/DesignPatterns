package com.codewithmosh.behavourial.iterator.demo;

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

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    // We need declare a nested class for the Iterator because getUrls() method
    // should not expose to outside classes as they will know the internal datastructure to iterate
    public class ListIterator implements Iterator {

        private BrowseHistory history;
        private int index;
        public ListIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < history.urls.size();
        }

        @Override
        public String current() {
            return history.urls.get(index);
        }

        @Override
        public void next() {
            ++index;
        }
    }

}
