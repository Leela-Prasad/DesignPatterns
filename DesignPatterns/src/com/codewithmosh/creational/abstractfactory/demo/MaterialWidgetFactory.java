package com.codewithmosh.creational.abstractfactory.demo;

import com.codewithmosh.creational.abstractfactory.demo.material.MaterialButton;
import com.codewithmosh.creational.abstractfactory.demo.material.MaterialTextBox;

public class MaterialWidgetFactory implements WidgetFactory{
    @Override
    public Button createButton() {
        return new MaterialButton();
    }

    @Override
    public TextBox CreateTextBox() {
        return new MaterialTextBox();
    }
}
