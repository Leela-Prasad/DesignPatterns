package com.codewithmosh.behavourial.memento.exercise;

public class Document {
    private String content;
    private String fontName;
    private String fontSize;

    public Document(String content, String fontName, String fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public DocumentMemento createMemento() {
        return new DocumentMemento(content, fontName, fontSize);
    }

    public void restore(DocumentMemento memento) {
        content = memento.getContent();
        fontName = memento.getFontName();
        fontSize = memento.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public String getFontSize() {
        return fontSize;
    }

    public void setFontSize(String fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize='" + fontSize + '\'' +
                '}';
    }
}
