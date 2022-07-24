package com.codewithmosh.behavourial.chainofResponsibility.exercise;

public class ExcelReader extends DataReader {

    protected ExcelReader(DataReader next) {
        super(next);
    }

    @Override
    public String getExtension() {
        return ".xls";
    }

    @Override
    public void doRead(String fileName) {
        System.out.println("Reading data from an Excel Spreadsheet");
    }
}
