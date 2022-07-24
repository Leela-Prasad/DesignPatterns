package com.codewithmosh.structural.proxy.exercise;

public class ProductProxy extends Product {
    private DbContext context;

    public ProductProxy(int id, DbContext context) {
        super(id);
        this.context = context;
    }

    public void setName(String name) {
        super.setName(name);
        context.markAsChanged(this);
    }
}
