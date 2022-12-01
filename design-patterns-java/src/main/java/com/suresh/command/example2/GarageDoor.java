package com.suresh.command.example2;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;

    }

    public void up() {
        System.out.println("Garage Door up!");
    }

    public void down() {
        System.out.println("Garage Door down!");
    }

}
