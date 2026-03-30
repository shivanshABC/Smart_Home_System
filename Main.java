package app;

import gui.GUI;
import service.DeviceManager;
import model.Light;
import model.Thermostat;

public class Main {

    public static void main(String[] args){

        DeviceManager manager = new DeviceManager();

        manager.addDevice(new Light(1,"Living Room Light",70));
        manager.addDevice(new Thermostat(2,"Hall Thermostat",22.5));

        new GUI(manager);
    }
}