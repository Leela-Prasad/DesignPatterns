package com.codewithmosh.creational.prototype.exercise;

public class Clip implements Component{
    @Override
    public Component clone() {
        return new Clip();
    }
}
