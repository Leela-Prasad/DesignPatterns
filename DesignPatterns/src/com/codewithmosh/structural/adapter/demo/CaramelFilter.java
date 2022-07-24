package com.codewithmosh.structural.adapter.demo;

import com.codewithmosh.structural.adapter.demo.avaFilters.Caramel;

// This is Adapter Class for third party Caramel Filter
public class CaramelFilter implements Filter {
    private Caramel caramel;

    public CaramelFilter(Caramel caramel) {
        this.caramel = caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render();
    }
}
