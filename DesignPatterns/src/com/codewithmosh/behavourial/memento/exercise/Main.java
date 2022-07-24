package com.codewithmosh.behavourial.memento.exercise;

public class Main {

    public static void main(String[] args) {

        History history = new History();

        Document document = new Document("a", "calibri", "12");
        history.push(document.createMemento());

        document = new Document("b", "raw", "18");
        history.push(document.createMemento());

        document = new Document("c", "times new roman", "20");
        history.push(document.createMemento());

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

        document.restore(history.pop());
        System.out.println(document);

    }
}
