package model;

public class Light extends Device {

    private int brightness;

    public Light(int id,String name,int brightness){
        super(id,name);
        this.brightness=brightness;
    }

    public String getDetails(){
        return name+" (Light) Brightness:"+brightness+"% Status:"+(status?"ON":"OFF");
    }
}
