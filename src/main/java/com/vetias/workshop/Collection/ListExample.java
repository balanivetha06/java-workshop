package com.vetias.workshop.Collection;

import java.util.ArrayList;
import java.util.List;

public class ListExample{
    public static void main(String[]args){
        List<String> names= new ArrayList<>();
        names.add("Raja");
        names.add("Bala");
        names.add("Nivi");
        names.add("nidarsh");
        names.add("kruthi");
        System.out.println("Names List:"+ names);
        for(String name : names){
            System.out.println("Name:" + name);
        }
        for ( int i=0; i< names.size(); i++){
            System.out.println("Name at index"+i + ":" +names.get(i));
        }
    }

}
