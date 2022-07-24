package com.codewithmosh.behavourial.visitor.demo;

public class Main {
    public static void main(String[] args) {
        var htmlDocument = new HtmlDocument();
        htmlDocument.add(new HeadingNode());
        htmlDocument.add(new AnchorNode());

        htmlDocument.execute(new HighlightOpertion());
        htmlDocument.execute(new PlainTextOperation());
    }
}
