package com.codewithmosh.creational.abstractfactory.exercise;

public class BuildMuscleFactory implements GoalFactory {
    @Override
    public WorkoutPlan createWorkoutPlan() {
        return new BuildMuscleWorkout();
    }

    @Override
    public MealPlan createMealPlan() {
        return new BuildMuscleMealPlan();
    }
}
