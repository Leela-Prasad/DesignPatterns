package com.codewithmosh.creational.abstractfactory.exercise;

public class Main {
    public static void main(String[] args) {
        var homepage = new HomePage();
        homepage.setGoal(new BuildMuscleFactory());
    }
}
