package com.codewithmosh.behavourial.strategy.demo;

public class BlackAndWhiteFilter implements Filter {
    @Override
    public void apply(String fileName) {
        System.out.println("Applying B&W Filter");
    }
}
