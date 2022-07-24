package com.codewithmosh.structural.proxy.demo;

public class LoggingEbookProxy implements Ebook {
    private String fileName;
    private RealEbook ebook;

    public LoggingEbookProxy(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void show() {
        if(ebook == null)
            ebook = new RealEbook(fileName);

        System.out.println("Logging");
        System.out.println("Authorization");
        ebook.show();
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
