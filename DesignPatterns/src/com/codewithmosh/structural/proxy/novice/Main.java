package com.codewithmosh.structural.proxy.novice;

public class Main {
    public static void main(String[] args) {
        var library = new Library();
        String[] fileNames = {"a", "b", "c"};
        for(String fileName: fileNames)
            library.add(new Ebook(fileName));

        library.openEbook("b");
    }
}
