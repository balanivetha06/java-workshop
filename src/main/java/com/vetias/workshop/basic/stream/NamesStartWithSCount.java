package com.vetias.workshop.basic.stream;

import java.util.ArrayList;
import java.util.List;

public class NamesStartWithSCount {
    public static void main(String[]args){
        List<String> names= new ArrayList<>();
        names.add("Selvi");
        names.add("Shalu");
        names.add("Nivi");
        names.add("Shruthi");
        names.add("kruthi");
        Long nameCount = names.stream()
        .filter(name-> name.startsWith("S")).count();
        System.out.println(nameCount);
    }

}
