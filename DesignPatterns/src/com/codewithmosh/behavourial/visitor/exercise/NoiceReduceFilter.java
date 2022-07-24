package com.codewithmosh.behavourial.visitor.exercise;

public class NoiceReduceFilter implements AudioFilter {
    @Override
    public void apply(FactSegment factSegment) {
        System.out.println("Noice Reduce Filter - Fact Segment");
    }

    @Override
    public void apply(FormatSegment formatSegment) {
        System.out.println("Noice Reduce Filter - Format Segment");
    }
}
