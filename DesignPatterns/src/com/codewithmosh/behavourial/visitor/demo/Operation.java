package com.codewithmosh.behavourial.visitor.demo;

public interface Operation {
    void apply(HeadingNode headingNode);
    void apply(AnchorNode anchorNode);
}
