package service;

import java.util.Random;

public class ApiService {

    public static double fetchTemperature() throws Exception{
        Random r=new Random();
        if(r.nextInt(10)<2){
            throw new Exception("Connection to API failed");
        }
        return 18 + r.nextDouble()*10;
    }
}
