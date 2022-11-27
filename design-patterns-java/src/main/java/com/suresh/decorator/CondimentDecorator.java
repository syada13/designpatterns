package com.suresh.decorator;

public abstract class CondimentDecorator extends Beverage {
    /*
     * Beverage that each Decorator will be wrapping.
     * We are using the Beverage supertype to refer to the Beverage so that the
     * Decorator can wrap any beverage.
     */

    Beverage beverage;

    public abstract String getDescription();

}
