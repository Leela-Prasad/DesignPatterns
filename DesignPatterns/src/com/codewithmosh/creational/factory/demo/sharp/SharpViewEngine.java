package com.codewithmosh.creational.factory.demo.sharp;

import com.codewithmosh.creational.factory.demo.matcha.ViewEngine;

import java.util.Map;

public class SharpViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "View Rendered by Sharp View Engine";
    }
}
