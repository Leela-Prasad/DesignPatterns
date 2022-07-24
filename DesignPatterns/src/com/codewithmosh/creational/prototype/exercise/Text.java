package com.codewithmosh.creational.prototype.exercise;

public class Text implements Component{
    private String content;

    public Text(String content) {
        this.content = content;
    }

    @Override
    public Component clone() {
        return new Text(content);
    }

    public String getContent() {
        return content;
    }
}
