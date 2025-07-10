<<<<<<< HEAD:src/main/java/com/vetias/workshop/basic/Agecalculate.java
package src.main.java.com.vetias.workshop.basic;
=======
package src.com.vetias.java.workshop.basic;
>>>>>>> fd2b7a0b34ef8ad720d975c4715b6db3df349389:src/com/vetias/java/workshop/basic/Agecalculate.java
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
<<<<<<< HEAD:src/main/java/com/vetias/workshop/basic/Agecalculate.java



}
=======
>>>>>>> fd2b7a0b34ef8ad720d975c4715b6db3df349389:src/com/vetias/java/workshop/basic/Agecalculate.java
