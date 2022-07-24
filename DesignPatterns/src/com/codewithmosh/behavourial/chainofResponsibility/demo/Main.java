package com.codewithmosh.behavourial.chainofResponsibility.demo;

public class Main {
    public static void main(String[] args) {
        //Aunthenticator -> Logger -> compressor
        var compressor = new Compressor(null);
        var logger = new Logger(compressor);
        var authenticator = new Authenticator(logger);
        var webserver = new WebServer(authenticator);
        var httpRequest = new HttpRequest("admin", "1234");
        webserver.handle(httpRequest);
    }
}
