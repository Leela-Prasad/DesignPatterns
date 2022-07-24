package com.codewithmosh.behavourial.visitor.exercise;

public class NormalizeFilter implements AudioFilter{
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Normalize Filter - Fact Segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Normalize Filter - Format Segment");
    }
}
