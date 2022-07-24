package com.codewithmosh.structural.composite.exercise;

import java.util.ArrayList;
import java.util.List;

public class Team implements Resource{
    private List<Resource> resources = new ArrayList<>();

    public void add(Resource resource) {
        resources.add(resource);
    }

    @Override
    public void deploy() {
        for(Resource resource: resources)
            resource.deploy();
    }
}
