package com.jetbrains.patternmatching.forinstanceof;

public class Monitor {
    String model;
    double price;

    @Override
    public boolean equals(Object o) {
        if (o instanceof Monitor other) {
            if (model.equals(other.model) && price == other.price) {
                return true;
            }
            return false;
        }
        return false;
    }
}