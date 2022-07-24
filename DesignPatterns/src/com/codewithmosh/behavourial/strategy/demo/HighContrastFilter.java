package com.codewithmosh.behavourial.strategy.demo;

public class HighContrastFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying HighContrast Filter");
    }
}
