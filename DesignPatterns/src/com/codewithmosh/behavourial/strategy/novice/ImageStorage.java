package com.codewithmosh.behavourial.strategy.novice;

public class ImageStorage {

    private String compressor;
    private String filter;

    public ImageStorage(String compressor, String filter) {
        this.compressor = compressor;
        this.filter = filter;
    }

    // Here this class violates
    // single responsibility principle as it is doing compression and filtering instead of storing
    // open closed principle as to support new compressor or new filter requires a change in this class
    // which is unmaintainable
    public void store(String fileName) {
        if(compressor == "jpeg")
            System.out.println("Compressing Using Jpeg");
        else if(compressor == "png")
            System.out.println("Compressing Using Png");

        if(filter == "b&w")
            System.out.println("Applying B&W Filter");
        else if(filter == "high-contrast")
            System.out.println("Applying high contrast  filter");
    }
}
