package com.codewithmosh.creational.abstractfactory.demo;

public class Main {
    public static void main(String[] args) {
        var form = new ContactForm();
        form.render(new MaterialWidgetFactory());
        //form.render(new TextBox.AntWidgetFactory());
    }
}
