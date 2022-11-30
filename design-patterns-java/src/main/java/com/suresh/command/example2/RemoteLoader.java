package com.suresh.command.example2;

import com.suresh.command.example2.LightOnCommand;

public class RemoteLoader {
    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl(); // Create Invoker object

        // Create all the devices in their place
        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("Garage");
        Sterio sterio = new Sterio("Living Room");

        // Create all the LightCommand objects
        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenRoomLightOn = new LightOnCommand(kitchenLight);
        LightOffCommand kitchenRoomLightOff = new LightOffCommand(kitchenLight);

        // Create all the On and Off for the ceiling fan
        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand();
        GarageDoorDownCommand garageDoorDown = GarageDoorDownCommand();

    }

}
