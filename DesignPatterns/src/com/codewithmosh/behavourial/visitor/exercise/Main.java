package com.codewithmosh.behavourial.visitor.exercise;

public class Main {
    public static void main(String[] args) {
        var wavFile = new WavFile();
        wavFile.add(new FormatSegment());
        wavFile.add(new FactSegment());
        wavFile.add(new FactSegment());
        wavFile.add(new FactSegment());

        wavFile.apply(new NoiceReduceFilter());
        wavFile.apply(new NormalizeFilter());
        wavFile.apply(new ReverbFilter());
    }
}
