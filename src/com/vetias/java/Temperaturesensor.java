package com.vetias.java;

public class Temperaturesensor implements Sensor {
    private float temperature;
    private temperaturesensor(float aTemperature){
        temperature=aTemperature;

    }
    public float getReading(){
        return temperature;
    }



}
