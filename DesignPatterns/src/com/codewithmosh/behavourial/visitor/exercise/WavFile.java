package com.codewithmosh.behavourial.visitor.exercise;

import java.util.ArrayList;
import java.util.List;

public class WavFile {
    private List<Segment> segments = new ArrayList<>();

    public void add(Segment segment) {
        segments.add(segment);
    }

    public void apply(AudioFilter filter) {
        segments.forEach(segment -> segment.applyFilter(filter));
    }
}
