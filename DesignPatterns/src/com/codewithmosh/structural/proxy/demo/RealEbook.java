package com.codewithmosh.structural.proxy.demo;

public class RealEbook implements Ebook {
    private String fileName;

    public RealEbook(String fileName) {
        this.fileName = fileName;
        load();
    }

    public void load() {
        System.out.println("Loading the Ebook " + fileName);
    }

    @Override
    public void show() {
        System.out.println("Showing the Ebook " + fileName);
    }

    @Override
    public String getFileName() {
        return fileName;
    }
}
