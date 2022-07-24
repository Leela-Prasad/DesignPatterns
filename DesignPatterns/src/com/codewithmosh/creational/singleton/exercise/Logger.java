package com.codewithmosh.creational.singleton.exercise;

import java.util.HashMap;
import java.util.Map;

public class Logger {
    private String fileName;
    private static Map<String, Logger> instances = new HashMap<>();

    private Logger(String fileName) {
        this.fileName = fileName;
    }

    public static Logger getInstance(String fileName) {
        if(!instances.containsKey(fileName)) {
            instances.put(fileName, new Logger(fileName));
        }

        return instances.get(fileName);

    }

    public void write(String message) {
        System.out.println("Writing message to log ...");
    }
}