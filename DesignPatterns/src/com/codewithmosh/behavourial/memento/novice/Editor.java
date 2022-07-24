package com.codewithmosh.behavourial.memento.novice;

import java.util.ArrayList;
import java.util.List;

public class Editor {
    private String content;
    private List<String> states = new ArrayList<>();

    public void undo() {
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        this.content = lastState;
        states.remove(lastState);
    }
}
