package com.codewithmosh.behavourial.visitor.demo;

public class HeadingNode implements HtmlNode {
    @Override
    public void execute(Operation operation) {
        operation.apply(this);
    }
}
