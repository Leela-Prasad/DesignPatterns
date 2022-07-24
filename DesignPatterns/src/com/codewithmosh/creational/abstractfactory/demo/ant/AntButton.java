package com.codewithmosh.creational.abstractfactory.demo.ant;


import com.codewithmosh.creational.abstractfactory.demo.Button;

public class AntButton implements Button {
    @Override
    public void render() {
        System.out.println("Ant Button");
    }
}
