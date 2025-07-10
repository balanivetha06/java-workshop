package src.main.java.com.vetias.workshop.basic;

import java.util.Arrays;

public class Newline {
    public static void main(String[]args){
        String sentence="This program show how can we split a string into multiple strings";
        String words[]= sentence.split(" ");
        for(String word:words)
        {
            System.out.println(word);
        }

    }

    

}

