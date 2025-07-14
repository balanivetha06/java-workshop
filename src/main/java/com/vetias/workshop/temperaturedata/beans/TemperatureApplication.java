package com.vetias.workshop.temperaturedata.beans;

import java.time.LocalDate;

public class TemperatureApplication {
    public static void main(String[]args){
        Organization org= new Organization(
            "vetias Tech",
            "Thindal,Erode",
            "www.vetias.com",
            "vetias@gmail.com",
            "8144999399",
            24221288,
            LocalDate.of(2025, 07, 25));
            System.out.println(org);

        
    }

}
