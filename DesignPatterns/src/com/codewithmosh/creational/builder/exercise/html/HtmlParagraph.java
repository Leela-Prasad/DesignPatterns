package com.codewithmosh.creational.builder.exercise.html;

public class HtmlParagraph implements HtmlElement {
    private String text;

    public HtmlParagraph(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return String.format("<p>%s</p>", text);
    }
}
