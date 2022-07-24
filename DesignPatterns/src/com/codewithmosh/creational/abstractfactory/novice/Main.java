package com.codewithmosh.creational.abstractfactory.novice;

public class Main {
    public static void main(String[] args) {
        var form = new ContactForm();
       // form.render(Theme.MATERIAL);
        form.render(Theme.ANT);
    }
}
