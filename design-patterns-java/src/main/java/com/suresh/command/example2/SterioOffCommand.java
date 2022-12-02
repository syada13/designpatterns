package com.suresh.command.example2;

public class SterioOffCommand implements Command {

    Sterio sterio;

    public SterioOffCommand(Sterio sterio) {
        this.sterio = sterio;

    }

    public void execute() {
        sterio.off();

    }

    public void undo() {
        sterio.on();
    }

}
