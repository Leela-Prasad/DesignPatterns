package com.codewithmosh.creational.builder.demo;

public class Main {
    public static void main(String[] args) {
        var presentation = new Presentation();
        presentation.addSlide(new Slide("Slide 1"));
        presentation.addSlide(new Slide("Slide 2"));

        //presentation.export(new PdfDocumentBuilder());
        var builder = new MovieBuilder();
        presentation.export(builder);
       var movie = builder.getMovie();

    }
}
