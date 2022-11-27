package com.suresh.factoryMethod;

import java.io.*;

/*
 Create a Plan abstract class i.e. a contract which will be used by client to get object.
 */
public abstract class Plan {
    protected double rate;

    abstract void getRate();

    public void calculateBill(int units) {
        System.out.println(units * rate);
    };
}
