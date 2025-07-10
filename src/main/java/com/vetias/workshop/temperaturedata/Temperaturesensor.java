package src.main.java.com.vetias.workshop.temperaturedata;

public class Temperaturesensor implements Sensor {
    private float temperature;
    private temperaturesensor(float aTemperature){
        temperature=aTemperature;

    }
    public float getReading(){
        return temperature;
    }



}
