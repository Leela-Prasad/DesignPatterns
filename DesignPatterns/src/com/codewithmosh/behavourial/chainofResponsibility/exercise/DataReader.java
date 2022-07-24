package com.codewithmosh.behavourial.chainofResponsibility.exercise;

public abstract class DataReader {
    private DataReader next;

    protected DataReader(DataReader next) {
        this.next = next;
    }

    public void read(String fileName) {
        if(fileName.endsWith(getExtension())) {
            doRead(fileName);
            return;
        }

        if(next !=null)
            next.read(fileName);
        else
            throw new UnsupportedOperationException("File Format not supported");
    }

    public abstract String getExtension();

    public abstract void doRead(String fileName);
}
