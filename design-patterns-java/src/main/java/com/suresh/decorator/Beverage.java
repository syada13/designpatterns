package com.suresh.decorator;

public abstract class Beverage {
    String description = " ";

    public String getDecsription() {
        return description;
    }

    // Subclasses will implement cost method
    public abstract double cost();

}
