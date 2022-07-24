package com.codewithmosh.creational.abstractfactory.demo;

public class ContactForm {
    void render(WidgetFactory factory) {
        factory.createButton().render();
        factory.CreateTextBox().render();
    }
}
