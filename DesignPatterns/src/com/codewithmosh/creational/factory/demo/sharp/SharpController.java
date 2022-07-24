package com.codewithmosh.creational.factory.demo.sharp;

import com.codewithmosh.creational.factory.demo.matcha.Controller;
import com.codewithmosh.creational.factory.demo.matcha.ViewEngine;

public class SharpController extends Controller {
    @Override
    protected ViewEngine createViewEngine() {
        return new SharpViewEngine();
    }
}
