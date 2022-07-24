package com.codewithmosh.creational.builder.exercise;

public interface DocumentBuilder {
    void addText(Text text);
    void addImage(Image image);
    String getResult();
}
