package com.codewithmosh.behavourial.memento.exercise;

import java.util.Stack;

public class History {
    private Stack<DocumentMemento> mementos = new Stack<>();

    public void push(DocumentMemento memento) {
        mementos.push(memento);
    }

    public DocumentMemento pop() {
        return mementos.pop();
    }

}
