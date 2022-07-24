package com.codewithmosh.behavourial.visitor.exercise;

public class ReverbFilter implements AudioFilter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Reverb Filter - Fact Segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Reverb Filter - Format Segment");
    }
}
