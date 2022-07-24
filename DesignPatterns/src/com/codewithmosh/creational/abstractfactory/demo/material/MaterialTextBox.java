package com.codewithmosh.creational.abstractfactory.demo.material;

import com.codewithmosh.creational.abstractfactory.demo.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
