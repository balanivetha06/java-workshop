package com.vetias.java.workshop.temperaturedata.beans;

public class Hostel extends Building {
    private boolean isMessAvailable;
    private int noOfRooms;
    public void setIsMessAvailable(boolean aIsMessAvailable)
    {
        isMessAvailable=aIsMessAvailable;
    }
    public boolean getIsMessAvailable()
    {
        return isMessAvailable;

    }
    public void setNoOfRooms(Boolean aNoOfRooms){
    noOfRooms=aNoOfRooms;
    }
    public boolean getNoOfRooms()
    {
        return noOfRooms;
    }

}
    

