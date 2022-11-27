package com.suresh.observer;

/*
 * All potentials observers need to implement this Observer interface.
 * The update method will be called when the Subject's state change
 */

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}