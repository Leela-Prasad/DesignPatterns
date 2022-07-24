package com.codewithmosh.creational.singleton.demo;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private Map<String, Object> settings = new HashMap<>();

    private static ConfigManager manager = new ConfigManager();

    private ConfigManager() {

    }

    public static ConfigManager getManager() {
        return manager;
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get(String key) {
        return settings.get(key);
    }
}
