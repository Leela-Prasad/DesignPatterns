package com.codewithmosh.creational.abstractfactory.novice.ant;

import com.codewithmosh.creational.abstractfactory.novice.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
