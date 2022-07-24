package com.codewithmosh.creational.abstractfactory.demo.material;

import com.codewithmosh.creational.abstractfactory.demo.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
