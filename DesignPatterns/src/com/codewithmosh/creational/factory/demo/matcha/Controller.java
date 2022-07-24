package com.codewithmosh.creational.factory.demo.matcha;

import java.util.Map;

public class Controller {
    public void render(String viewName, Map<String, Object> context) {
        var engine = createViewEngine();
        System.out.println(engine.render(viewName, context));
    }

    protected ViewEngine createViewEngine() {
        return new MatchaViewEngine();
    }
}
