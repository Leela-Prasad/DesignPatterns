package com.codewithmosh.creational.factory.exercise;

import java.util.Date;

public class GregorianCalendar implements Calendar {

    @Override
    public void addEvent(Event event, Date date) {
        System.out.println("GregorianCalendar: Adding an Event on the given date");
    }
}
