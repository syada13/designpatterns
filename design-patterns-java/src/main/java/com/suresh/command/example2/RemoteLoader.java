package com.suresh.command.example2;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo(); // Create Invoker object

        // Create all the devices in their place
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Sterio sterio = new Sterio("Living Room");

        // Create all the LightCommand objects
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        // Create all the On and Off for the ceiling fan
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        // Create the Up and Down commands for the garage
        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);

        // Create the stero On and Off commands
        SterioOnWithCDCommand sterioOnWithCDCommand = new SterioOnWithCDCommand(sterio);
        SterioOffCommand SterioOffCommand = new SterioOffCommand(sterio);

        /*
         * Now that we've got all our commands, we need to load them into the remote
         * slots
         */

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
        remoteControl.setCommand(3, sterioOnWithCDCommand, SterioOffCommand);

        /*
         * Here , we are using our overridden toString() method to print each remote
         * slot and the command assigned to it.
         * We then step through each slot and push its On and Off buttons
         * System.out.println(remoteControl);
         */

        remoteControl.OnButtonWasPushed(0);
        remoteControl.OffButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        remoteControl.OffButtonWasPushed(0);
        remoteControl.OnButtonWasPushed(0);
        System.out.println(remoteControl);
        remoteControl.undoButtonWasPressed();

        remoteControl.OnButtonWasPushed(1);
        remoteControl.OffButtonWasPushed(1);
        remoteControl.OnButtonWasPushed(2);
        remoteControl.OffButtonWasPushed(2);
        remoteControl.OnButtonWasPushed(3);
        remoteControl.OffButtonWasPushed(3);
    }

}
