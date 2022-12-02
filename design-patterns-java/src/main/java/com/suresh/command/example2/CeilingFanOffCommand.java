package com.suresh.command.example2;

public class CeilingFanOffCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOffCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;

    }

    public void execute() {
        ceilingFan.off();
    }

    public void undo() {
        ceilingFan.on();
    }

}
