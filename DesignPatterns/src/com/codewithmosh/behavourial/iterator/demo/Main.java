package com.codewithmosh.behavourial.iterator.demo;

public class Main {
    public static void main(String[] args) {
        var history = new BrowseHistory();
        history.push("aa");
        history.push("bb");
        history.push("cc");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
