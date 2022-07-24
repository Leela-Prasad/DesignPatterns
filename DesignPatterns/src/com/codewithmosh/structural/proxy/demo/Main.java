package com.codewithmosh.structural.proxy.demo;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for(String fileName: fileNames)
            library.add(new LoggingEbookProxy(fileName));

        library.openEbook("b");
        library.openEbook("c");
    }
}
