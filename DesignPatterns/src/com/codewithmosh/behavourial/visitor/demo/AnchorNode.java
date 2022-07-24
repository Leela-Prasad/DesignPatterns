package com.codewithmosh.behavourial.visitor.demo;

public class AnchorNode implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
