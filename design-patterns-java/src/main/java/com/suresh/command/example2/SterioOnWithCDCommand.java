package com.suresh.command.example2;

public class SterioOnWithCDCommand implements Command {

    Sterio sterio;

    public SterioOnWithCDCommand(Sterio sterio) {
        this.sterio = sterio;

    }

    public void execute() {
        sterio.on();
        sterio.setCD();
        sterio.setVolume(11);

    }

}
