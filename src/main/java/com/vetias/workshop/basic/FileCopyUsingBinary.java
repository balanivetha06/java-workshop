package src.main.java.com.vetias.workshop.basic;

import java.io.FileInputStream;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("input txt");
            FileInputStream outputStream = new FileInputStream("output.txt")) {
            byte[] chunk = new byte[1024];
            int byteRead;
            while ((byteRead = inputStream.read(chunk)) != -1) {
                outputStream.write(chunk, 0, byteRead);
            }
        } catch (Exception e) {
            System.out.println("error is reading or writing the file");
        }   
    }

}
