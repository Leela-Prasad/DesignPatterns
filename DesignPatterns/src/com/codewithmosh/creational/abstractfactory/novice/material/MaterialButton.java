package com.codewithmosh.creational.abstractfactory.novice.material;

import com.codewithmosh.creational.abstractfactory.novice.Button;

public class MaterialButton implements Button {
    @Override
    public void render() {
        System.out.println("Material Button");
    }
}
