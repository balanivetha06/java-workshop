package src.main.java.com.vetias.workshop.basic;

    import java.io.BufferedReader;
    import java.io.FileReader;
    import java.io.IOException;
    public class CharacterBasedReaderExample{
    
        public static void main(String[] args){
            try(BufferedReader reader = new BufferedReader(new FileReader("README.md")))
            {
                String line;
                while((line=reader.readLine())!=null){
                    System.out.println(line);
                }
            } catch (IOException e) {
                System.out.println("An error ocurred while reading the file:" + e.getMessage());
            }
        }
    
    }



