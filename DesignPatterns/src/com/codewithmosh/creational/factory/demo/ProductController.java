package com.codewithmosh.creational.factory.demo;

import com.codewithmosh.creational.factory.demo.matcha.Controller;
import com.codewithmosh.creational.factory.demo.matcha.ViewEngine;
import com.codewithmosh.creational.factory.demo.sharp.SharpController;
import com.codewithmosh.creational.factory.demo.sharp.SharpViewEngine;

import java.util.HashMap;
import java.util.Map;

public class ProductController extends SharpController {
    public void listProducts() {
        Map<String, Object> context = new HashMap<>();
        render("products.html", context);
    }

}
