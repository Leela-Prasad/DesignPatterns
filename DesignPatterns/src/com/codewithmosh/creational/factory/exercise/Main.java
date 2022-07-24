package com.codewithmosh.creational.factory.exercise;

public class Main {
    public static void main(String[] args) {
        var scheduler = new Scheduler();
        scheduler.schedule(new Event());

        var scheduler2 = new ArabianScheduler();
        scheduler2.schedule(new Event());
    }
}
