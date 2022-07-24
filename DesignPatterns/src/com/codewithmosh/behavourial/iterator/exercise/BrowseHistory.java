package com.codewithmosh.behavourial.iterator.exercise;

public class BrowseHistory {
    private String[] urls = new String[10];
    private int count;

    public void push(String url) {
        urls[count++] = url;
    }

    public String pop() {
        --count;
        return urls[count];
    }

    public Iterator createIterator() {
        return new ArrayIterator(this);
    }

    // We need declare a nested class for the Iterator because getUrls() method
    // should not expose to outside classes as they will know the internal datastructure to iterate
    public class ArrayIterator implements Iterator {

        private BrowseHistory history;
        private int index;
        public ArrayIterator(BrowseHistory history) {
            this.history = history;
        }

        @Override
        public boolean hasNext() {
            return index < count;
        }

        @Override
        public String current() {
            return history.urls[index];
        }

        @Override
        public void next() {
            ++index;
        }
    }

}
