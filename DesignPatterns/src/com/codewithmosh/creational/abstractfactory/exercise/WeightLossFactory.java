package com.codewithmosh.creational.abstractfactory.exercise;

public class WeightLossFactory implements GoalFactory{
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new WeighLossWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new WeightLossMealPlan();
    }
}
