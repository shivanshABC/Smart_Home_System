package model;

public class Thermostat extends Device {

    private double temperature;

    public Thermostat(int id,String name,double temperature){
        super(id,name);
        this.temperature=temperature;
    }

    public String getDetails(){
        return name+" (Thermostat) Temp:"+temperature+" Status:"+(status?"ON":"OFF");
    }
}
