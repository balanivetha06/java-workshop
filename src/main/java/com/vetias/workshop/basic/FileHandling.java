package src.main.java.com.vetias.workshop.basic;

import java.io.File;

public class FileHandling {
    public static void main(String[] args) {
        File file = new File("src");
        if(file.exists()){
            System.out.println("The file exists.");
            if(file.isDirectory()){
                System.out.println("it is a directory.");
                File[]files=file.listFiles();
                if(files != null){
                    System.out.println("files in a directory:");
                    for(File f : files){
                        System.out.println(f.getName());
                    }
                
                } else{
                    System.out.println(" the directory is empty.");
                }
            } else{
                System.out.println("it is a file.");
            }
        } else{
            System.out.println("the file does not exist");
        }
    }


}
