package com.codewithmosh.behavourial.iterator.exercise2;

import java.util.ArrayList;
import java.util.List;

public class ProductCollection {
    private List<Product> products = new ArrayList<>();

    public void add(Product product) {
        products.add(product);
    }

    public Iterator createIterator() {
        return new ListIterator(this);
    }

    public class ListIterator implements Iterator {

        private ProductCollection productCollection;
        private int index;

        public ListIterator(ProductCollection productCollection) {
            this.productCollection = productCollection;
        }

        @Override
        public boolean hasNext() {
            return index < productCollection.products.size();
        }

        @Override
        public Product current() {
            return productCollection.products.get(index);
        }

        @Override
        public void next() {
            ++index;
        }
    }
}
