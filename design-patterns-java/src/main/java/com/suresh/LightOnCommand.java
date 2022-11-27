package com.suresh;

/*
 * LightOnCommand is a command for turning a light on , so we need to implement Command interface.
 * The constructor is passed a specific light(reciever) that this command is going to control.
 */

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    /*
     * The execute method calls the on() method on the recieving object
     * which is the light we are controlling.
     */
    public void execute() {
        light.On();
    }

}
