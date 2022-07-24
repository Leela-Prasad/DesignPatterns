package com.codewithmosh.creational.builder.exercise.html;

public class HtmlImage implements HtmlElement {
    private String source;

    public HtmlImage(String source) {
        this.source = source;
    }

    @Override
    public String toString() {
        return String.format("<img src=\"%s\" />", source);
    }
}
