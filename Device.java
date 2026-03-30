package model;

public abstract class Device implements Controllable {

    protected int id;
    protected String name;
    protected boolean status;

    public Device(int id,String name){
        this.id=id;
        this.name=name;
    }

    public String getName(){
        return name;
    }

    public boolean isOn(){
        return status;
    }

    public void turnOn(){ status=true; }
    public void turnOff(){ status=false; }

    public abstract String getDetails();
}
