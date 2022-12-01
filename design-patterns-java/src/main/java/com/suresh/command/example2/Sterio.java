package com.suresh.command.example2;

public class Sterio {
    String name;

    public Sterio(String name) {
        this.name = name;

    }

    public void on() {
        System.out.println(name + " sterio turned on");
    }

    public void off() {
        System.out.println(name + " sterio turned off" + "\n");
    }

    public void setCD() {
        System.out.println(name + " sterio is set for CD input");
    }

    public void setVolume(int volume) {
        System.out.println(name + " sterio volume setup to " + volume);
    }

}
