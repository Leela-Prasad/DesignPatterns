package com.codewithmosh.behavourial.chainofResponsibility.exercise;

public class QuickBookReader extends DataReader {
    protected QuickBookReader(DataReader next) {
        super(next);
    }

    @Override
    public String getExtension() {
        return ".qbw";
    }

    @Override
    public void doRead(String fileName) {
        System.out.println("Reading data from Quickbooks file");
    }
}
