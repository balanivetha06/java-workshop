
package main.java.com.vetias.workshop.basic;
import java.time.LocalDate;
import java.util.Scanner;
public class Agecalculate {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Date of birth (YYY-MM-DD)):");
        String dateofBirth=sc.nextLine();
        LocalDate birthdate=LocalDate.parse(dateofBirth);
        int yearofbirth=birthdate.getYear();
        int currentYear=LocalDate.now().getYear();
        int age= currentYear - yearofbirth;
        System.out.println("Your age:"+age);
    


    }

}
