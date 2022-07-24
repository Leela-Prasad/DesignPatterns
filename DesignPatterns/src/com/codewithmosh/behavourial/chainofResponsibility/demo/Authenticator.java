package com.codewithmosh.behavourial.chainofResponsibility.demo;

public class Authenticator extends Handler {

    protected Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest request) {
        System.out.println("Authenticator");
        boolean isValid = request.getUsername() == "admin" && request.getPassword() == "1234";
        return !isValid;
    }
}
