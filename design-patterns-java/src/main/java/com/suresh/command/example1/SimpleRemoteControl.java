package com.suresh.command.example1;

/*
 * Using a command object.
 * We got a remote control (invoker) with only one button, and corresponding slot to hold a device to control.
 */

public class SimpleRemoteControl {

    Command slot; // One slot to hold our command which will control one device.

    public SimpleRemoteControl() {
    }

    /*
     * This method is used to set the command the slot is going to control.
     */

    public void setCommand(Command command) {
        slot = command;

    }

    /*
     * This method is called when the button is pressed.
     * All we do is take the current command bound to the slot and call its
     * execute() method
     */
    public void buttonWasPressued() {
        slot.execute();
    }

}
