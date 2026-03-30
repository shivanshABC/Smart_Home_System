package service;

import model.Device;
import java.util.*;

public class DeviceManager {

    private List<Device> devices=new ArrayList<>();

    public void addDevice(Device d){
        devices.add(d);
    }

    public List<Device> getDevices(){
        return devices;
    }
}
