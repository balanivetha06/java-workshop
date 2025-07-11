package com.vetias.workshop.basic.stream;

import java.util.ArrayList;
import java.util.List;

public class StreamUpperCaseNames {
    public static void main(String[]args){
        List<String> names= new ArrayList<>();
        names.add("Selvi");
        names.add("Shalu");
        names.add("Nivi");
        names.add("Shruthi");
        names.stream()
        .filter(name -> name.startsWith("S") || name.startsWith("S"))
        .distinct().map(String::toUpperCase).forEach(System.out::println);
    }

}
