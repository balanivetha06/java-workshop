package com.main.java.com.vetias.workshop.basic;
import java.util.Arrays;

public class Twodimensional {
    public static void main(String[]args){
        String employeedetails[][]=new String[5][2];
        employeedetails[0][0]="1002";
        employeedetails[0][1]="balanivi";
        employeedetails[1][0]="1003";
        employeedetails[1][1]="nivi";
        employeedetails[2][0]="1004";
        employeedetails[2][1]="nidarsh";
        employeedetails[3][0]="1005";
        employeedetails[3][1]="kiruthi";
        employeedetails[4][0]="1006";
        employeedetails[4][1]="Nisha";
        for(String[]employee:employeedetails){
            System.out.println(Arrays.toString (employee));
        }

        

    }
    
}
