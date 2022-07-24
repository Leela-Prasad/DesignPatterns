package com.codewithmosh.creational.factory.exercise;

public class ArabianScheduler extends Scheduler {

    @Override
    protected Calendar createCalendar() {
        return new ArabianCalendar();
    }
}
