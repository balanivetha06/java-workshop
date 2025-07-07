package com.vetias.java.workshop.basic;

public class Count {
    public static void main(String[]args){
        String sentence="This program show how can we split a string into multiple strings";
        String words[]= sentence.split(" ");
        int num=words.length;
        System.out.println(num);
    }

}



