package com.codewithmosh.behavourial.mediator.approach2;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void addEventHandler(EventHandler observer) {
        eventHandlers.add(observer);
    }

    public void notifyEventHandlers() {
        eventHandlers.stream().forEach(observer -> observer.handle());
    }
}
