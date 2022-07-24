package com.codewithmosh.creational.builder.exercise;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        var document = new Document();
        document.addElement(new Text("Hello World"));
        document.addElement(new Image("pic1.jpg"));
        document.export(new HtmlDocumentBuilder(), "result.html");
        document.export(new TextDocumentBuilder(), "result.txt");
    }
}
