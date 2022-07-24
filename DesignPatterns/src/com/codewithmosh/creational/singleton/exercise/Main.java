package com.codewithmosh.creational.singleton.exercise;

public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance("log1");
        Logger logger2 = Logger.getInstance("log1");
        Logger logger3 = Logger.getInstance("log2");

        System.out.println(logger1 == logger2);
        System.out.println(logger1 == logger3);


    }
}
