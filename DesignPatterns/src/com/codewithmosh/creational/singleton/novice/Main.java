package com.codewithmosh.creational.singleton.novice;

public class Main {
    public static void main(String[] args) {
        var manager = new ConfigManager();
        manager.set("name", "prasad");

        var manager2 = new ConfigManager();
        System.out.println(manager2.get("name"));
    }
}
