package com.suresh.decorator;

public class Whip extends CondimentDecorator {

    public Whip(Beverage beverage) {
        this.beverage = beverage;

    }

    public String getDescription() {
        return beverage.getDecsription() + ", Whip";
    }

    public double cost() {
        return beverage.cost() + .10;
    }

}
