package com.codewithmosh.creational.prototype.exercise;

public class Audio implements Component {
    @Override
    public Component clone() {
        return new Audio();
    }
}
