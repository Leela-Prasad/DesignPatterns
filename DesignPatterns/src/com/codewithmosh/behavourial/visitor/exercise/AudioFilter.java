package com.codewithmosh.behavourial.visitor.exercise;

public interface AudioFilter {
    void apply(FactSegment factSegment);
    void apply(FormatSegment formatSegment);
}
