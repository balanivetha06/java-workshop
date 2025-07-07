package src.com.vetias.java.workshop.basic;

public class Wordcount {
    public static void main(String[] args){
        String sentence="This program show how can we split a string into multiple strings.we need to find sentence,";
        String send[]= sentence.split("\\. ");
        int sentencecount= send.length;
        System.out.println("no of lines:"+sentencecount);
        
        String words[]= sentence.split(" ");
        int wordcount= words.length;
        System.out.println("no of words:"+wordcount);
        String letter[]= sentence.split("");
        int letters= letter.length;
        System.out.println("no of letters:"+letters);





}
}
