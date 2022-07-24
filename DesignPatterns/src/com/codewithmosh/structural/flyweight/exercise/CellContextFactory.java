package com.codewithmosh.structural.flyweight.exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class CellContextFactory {
    private Map<Integer, CellContext> contexts = new HashMap<>();

    public CellContext getCellContext(String fontFamily, int fontSize, boolean isBold) {
        Integer hash = Objects.hash(fontFamily, fontSize, isBold);
        if(!contexts.containsKey(hash)) {
            contexts.put(hash, new CellContext(fontFamily, fontSize, isBold));
        }

        return contexts.get(hash);
    }

}
