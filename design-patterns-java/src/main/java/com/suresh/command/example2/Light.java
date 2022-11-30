package com.suresh.command.example2;

/*
 * Lets create a reciever with actions(On and Off) methods.
 */

public class Light {

    String name;

    public Light(String name) {
        this.name = name;

    }

    public void on() {
        System.out.print("Turned light on!");

    }

    public void off() {
        System.out.print("Turned light off!");

    }

}
