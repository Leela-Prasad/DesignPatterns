package com.codewithmosh.behavourial.mediator.exercise;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
    private List<EventHandler> eventHandlers = new ArrayList<>();

    public void attach(EventHandler eventHandler) {
        eventHandlers.add(eventHandler);
    }

    public void notifyEventHandlers() {
        eventHandlers.stream().forEach(eventHandler -> eventHandler.handle());
    }
}
