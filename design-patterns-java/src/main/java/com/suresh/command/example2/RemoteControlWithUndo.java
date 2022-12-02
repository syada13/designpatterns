package com.suresh.command.example2;

/*
 * Invoker - The RemoteControlWithUndo is going to handle On and Off commands
 * Undo - We are adding new instance variable to track the last command invoked, then whenever
 * the undo button is pressed, we retrieve the last  invoked command and invoke its undo button.
 */

public class RemoteControlWithUndo {
    Command[] onCommands;
    Command[] offCommands;
    Command undoCommand;

    /*
     * In this constructor, we need to instantiate and initialise the On and Off
     * arrays.
     * Just like other slots, undo starts off with a noCommand,so pressing undo
     * before any other button won't do anything.
     */
    public RemoteControlWithUndo() {
        onCommands = new Command[7];
        offCommands = new Command[7];

        Command noCommand = new NoCommand(); // Null object
        for (int i = 0; i < 7; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;

        }
        undoCommand = noCommand;

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
        undoCommand = onCommands[slot];

    }

    public void OffButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand = offCommands[slot];
    }

    public void undoButtonWasPressed() {
        undoCommand.undo();

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
                    + "   " + offCommands[i].getClass().getName() + "\n");

        }
        return stringBuffer.toString();
    }

}
