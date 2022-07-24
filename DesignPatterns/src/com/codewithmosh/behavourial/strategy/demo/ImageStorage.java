package com.codewithmosh.behavourial.strategy.demo;

public class ImageStorage {

    private Compressor compressor;
    private Filter filter;

    public ImageStorage(Compressor compressor, Filter filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    // Now This class not responsible for Compression and Filtering Technique
    // and comply with Single Responsibility Principle
    public void store(String fileName) {
       compressor.compress(fileName);
       filter.apply(fileName);
    }
}
