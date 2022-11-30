package com.suresh.command.example2;

public class CeilingFanOnCommand implements Command {
    CeilingFan ceilingFan;

    public CeilingFanOnCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;

    }

    public void execute() {
        ceilingFan.on();
    }
}
