package com.codewithmosh.behavourial.chainofResponsibility.exercise;

public class Main {
    public static void main(String[] args) {
        // xls -> numbers -> qbw
        var qbw = new QuickBookReader(null);
        var numbers = new NumbersReader(qbw);
        var xls = new ExcelReader(numbers);

        var reader = xls;
        reader.read("data.xls");
        reader.read("data.numbers");
        reader.read("data.qbw");
        reader.read("data.jpg");
    }
}
