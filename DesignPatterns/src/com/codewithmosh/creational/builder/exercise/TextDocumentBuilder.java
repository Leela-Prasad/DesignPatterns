package com.codewithmosh.creational.builder.exercise;

public class TextDocumentBuilder implements DocumentBuilder {
    private StringBuilder sb = new StringBuilder();

    @Override
    public void addText(Text text) {
        sb.append(text.getContent());
    }

    @Override
    public void addImage(Image image) {
        // Not Required
    }

    @Override
    public String getResult() {
        return sb.toString();
    }
}
