package com.codewithmosh.behavourial.visitor.exercise;

public class FactSegment implements Segment {
    @Override
    public void applyFilter(AudioFilter filter) {
        filter.apply(this);
    }
}
