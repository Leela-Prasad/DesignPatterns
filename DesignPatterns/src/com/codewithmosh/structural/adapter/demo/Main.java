package com.codewithmosh.structural.adapter.demo;

import com.codewithmosh.structural.adapter.demo.avaFilters.Caramel;

public class Main {
    public static void main(String[] args) {
        var imageView = new ImageView(new Image());
        //imageView.apply(new VividFilter());
        imageView.apply(new CaramelFilter(new Caramel()));
    }
}
