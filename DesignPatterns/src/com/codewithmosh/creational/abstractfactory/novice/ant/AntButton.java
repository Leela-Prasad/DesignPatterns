package com.codewithmosh.creational.abstractfactory.novice.ant;


import com.codewithmosh.creational.abstractfactory.novice.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
