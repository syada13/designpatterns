package com.suresh.command.example2;

/*
 * Invoker - The RemoteControl is going to handle On and Off commands
 */

public class RemoteControl {
    Command[] onCommands;
    Command[] offCommands;

    /*
     * In this constructor, we need to instantiate and initialise the On and Off
     * arrays.
     */
    public RemoteControl() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand(); // Null object
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

        }

    }

    /*
     * Setup the command on the slot / pass the command to the invoker.
     * It takes a slot position and an On and Off command to be stored in that slot.
     */
    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand; // Put these commands in the On and Off arrays for later use.
        offCommands[slot] = offCommand;

    }

    public void OnButtonWasPushed(int slot) {
        onCommands[slot].execute();

    }

    public void OffButtonWasPushed(int slot) {
        offCommands[slot].execute();
    }

    /*
     * Overriding toString method to print out each slot and its corresponding
     * command.
     */
    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\n---- Remote Control------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuffer.append("[slot " + i + "]" + onCommands[i].getClass().getName()
                    + " " + offCommands[i].getClass().getName() + "\n");

        }
        return stringBuffer.toString();
    }

}
