package com.suresh.command.example2;

public class CeilingFan {
    String name;

    public CeilingFan(String name) {
        this.name = name;

    }

    public void on() {
        System.out.print(name + " ceiling fan turned on" + "\n");

    }

    public void off() {
        System.out.print(name + "  ceiling fan turned off" + "\n");

    }

}
