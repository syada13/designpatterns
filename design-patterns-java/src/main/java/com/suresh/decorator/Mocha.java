package com.suresh.decorator;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDecsription() + ", Mocha";
    }

    public double cost() {
        return beverage.cost() + .20;
    }

}
