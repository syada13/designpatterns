package com.suresh.command.example1;

/*
 * This is client which :
 *   a) creates a command object 
 *   b) It calls the setCommand to store the command in the Invoker(SimpleRemoteContro/ remote)
 * 
 * Client asks the invoker /remote to invoke execute the command when the button is pressued.
 */
public class RemoteControlTest {

    public static void main(String[] args) {

        Light light = new Light(); // Create a light(reciever) object.
        LightOnCommand lightOn = new LightOnCommand(light); // Create a concrete command and pass the Reciever to it
        SimpleRemoteControl remote = new SimpleRemoteControl(); // Remote is our Invoker.

        remote.setCommand(lightOn);// Pass the command to the invoker
        remote.buttonWasPressued(); // Simulate the button being pressed.

    }

}
