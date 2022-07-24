package com.codewithmosh.creational.singleton.demo;

public class Main {
    public static void main(String[] args) {
        var manager = ConfigManager.getManager();
        manager.set("name", "prasad");

        var manager2 = ConfigManager.getManager();
        System.out.println(manager2.get("name"));
    }
}
