package com.codewithmosh.creational.abstractfactory.demo.ant;

import com.codewithmosh.creational.abstractfactory.demo.TextBox;

public class AntTextBox implements TextBox {
    @Override
    public void render() {
        System.out.println("Ant TextBox");
    }
}
