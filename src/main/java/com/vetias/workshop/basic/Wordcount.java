<<<<<<< HEAD:src/main/java/com/vetias/workshop/basic/Wordcount.java
package src.main.java.com.vetias.workshop.basic;
=======
package src.com.vetias.java.workshop.basic;
>>>>>>> fd2b7a0b34ef8ad720d975c4715b6db3df349389:src/com/vetias/java/workshop/basic/Wordcount.java

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
<<<<<<< HEAD:src/main/java/com/vetias/workshop/basic/Wordcount.java

}
=======
>>>>>>> fd2b7a0b34ef8ad720d975c4715b6db3df349389:src/com/vetias/java/workshop/basic/Wordcount.java
