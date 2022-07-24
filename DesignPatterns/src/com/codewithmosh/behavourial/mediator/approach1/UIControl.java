package com.codewithmosh.behavourial.mediator.approach1;

public class UIControl {
    protected DialogBox owner;

    public UIControl(DialogBox owner) {
        this.owner = owner;
    }
}
