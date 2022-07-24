package com.codewithmosh.creational.abstractfactory.novice.material;

import com.codewithmosh.creational.abstractfactory.novice.TextBox;

public class MaterialTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Material TextBox");
    }
}
