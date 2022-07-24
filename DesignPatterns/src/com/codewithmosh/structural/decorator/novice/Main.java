package com.codewithmosh.structural.decorator.novice;

public class Main {
    public static void main(String[] args) {
//        var stream = new CloudStream();
//        var stream = new EncryptedCloudStream();
        var stream = new CompressedCloudStream();
        stream.write("Information");
    }
}
