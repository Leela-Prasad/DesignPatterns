package com.codewithmosh.creational.builder.exercise;

import com.codewithmosh.creational.builder.exercise.html.HtmlDocument;
import com.codewithmosh.creational.builder.exercise.html.HtmlImage;
import com.codewithmosh.creational.builder.exercise.html.HtmlParagraph;

public class HtmlDocumentBuilder implements DocumentBuilder{
    private HtmlDocument htmlDocument = new HtmlDocument();
    @Override
    public void addText(Text text) {
        htmlDocument.add(new HtmlParagraph(text.getContent()));
    }

    @Override
    public void addImage(Image image) {
        htmlDocument.add(new HtmlImage(image.getSource()));
    }

    @Override
    public String getResult() {
        return htmlDocument.toString();
    }
}
