package com.vetias.workshop.basic.stream;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayStream {
    public static void main(String[]args){
        int[] marks={99,90,78,67,34,100};
        long numberOfSubjectsPassed = Arrays.stream(marks)
        .filter(mark -> mark >40).count();
        System.out.println(numberOfSubjectsPassed);
        IntStream markStream = Arrays.stream(marks);
        numberOfSubjectsPassed=markStream
        .filter(mark -> mark > 40).count();

    }

}
