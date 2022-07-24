package com.codewithmosh.creational.builder.demo;

import java.util.ArrayList;
import java.util.List;

public class Presentation {
    private List<Slide> slides = new ArrayList<>();

    public void addSlide(Slide slide) {
        slides.add(slide);
    }

    public void export(PresentationBuilder builder) {
        builder.addSlide(new Slide("Copyright Slide"));
        for(Slide slide: slides)
            builder.addSlide(slide);
    }
}
