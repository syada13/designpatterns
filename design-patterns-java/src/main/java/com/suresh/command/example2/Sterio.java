package com.suresh.command.example2;

public class Sterio {
    String name;

    public Sterio(String name) {
        this.name = name;

    }

    public void on() {
        System.out.println("Sterio turned on");
    }

    public void setCD() {
        System.out.println("CD inserted and ready to play");
    }

    public void setVolume(int volume) {
        System.out.println("Volume setup to:" + volume);
    }

}
