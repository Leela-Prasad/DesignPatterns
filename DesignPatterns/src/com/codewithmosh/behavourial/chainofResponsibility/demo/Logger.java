package com.codewithmosh.behavourial.chainofResponsibility.demo;

public class Logger extends Handler {
    protected Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Logging");
        return false;
    }
}
