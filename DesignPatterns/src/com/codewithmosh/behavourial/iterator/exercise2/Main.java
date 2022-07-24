package com.codewithmosh.behavourial.iterator.exercise2;

public class Main {
    public static void main(String[] args) {
        var productCollection = new ProductCollection();
        productCollection.add(new Product(1, "Product1"));
        productCollection.add(new Product(2, "Product2"));
        productCollection.add(new Product(3, "Product3"));

        Iterator iterator = productCollection.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.current());
            iterator.next();
        }
    }
}
