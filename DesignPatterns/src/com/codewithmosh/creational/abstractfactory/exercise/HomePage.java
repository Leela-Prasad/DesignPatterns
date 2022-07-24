package com.codewithmosh.creational.abstractfactory.exercise;

public class HomePage {
    public void setGoal(GoalFactory factory) {
        factory.createWorkoutPlan();
        factory.createMealPlan();
    }
}
