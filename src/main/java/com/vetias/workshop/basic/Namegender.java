package src.main.java.com.vetias.workshop.basic;

    import java.util.Scanner;

public class Namegender{
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name :");
        String name=sc.next();
        System.out.println("Enter your gender :");
        String gender=sc.next();
        System.out.println("Enter your Qualification :");
        String qualification=sc.next();
        if("male".equalsIgnoreCase(gender)){
            System.out.println("Mr."+name +"qualificaion:"+ qualification);

        }
        else if("female".equalsIgnoreCase(gender)){
            System.out.println("Ms."+name+ "qualification:"+qualification);
        }
        else{
            System.out.println("Invalid gender");
        }
    }

}


