package com.codewithmosh.behavourial.chainofResponsibility.exercise;

public class NumbersReader extends DataReader {

    protected NumbersReader(DataReader next) {
        super(next);
    }

    @Override
    public String getExtension() {
        return ".numbers";
    }

    @Override
    public void doRead(String fileName) {
        System.out.println("Reading data from a Numbers Spreadsheet");
    }
}
