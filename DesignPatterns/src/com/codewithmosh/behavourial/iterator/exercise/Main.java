package com.codewithmosh.behavourial.iterator.exercise;

public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("aaa");
        history.push("bbb");
        history.push("ccc");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
