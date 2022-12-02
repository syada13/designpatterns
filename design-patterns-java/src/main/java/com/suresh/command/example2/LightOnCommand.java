package com.suresh.command.example2;

public class LightOnCommand implements Command {
    Light light;

    public LightOnCommand(Light light) {
        this.light = light;

    }

    public void execute() {
        light.on();
    }

    /*
     * Execute() method turns the light on and undo() method simply turns light off
     */
    public void undo() {
        light.off();
    }
}