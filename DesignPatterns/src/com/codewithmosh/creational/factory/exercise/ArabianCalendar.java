package com.codewithmosh.creational.factory.exercise;

import java.util.Date;

public class ArabianCalendar implements Calendar {
    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("ArabianCalendar: Adding an Event on the given date");
    }
}
