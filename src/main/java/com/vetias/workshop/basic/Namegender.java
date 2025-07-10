<<<<<<< HEAD:src/main/java/com/vetias/workshop/basic/Namegender.java
package src.main.java.com.vetias.workshop.basic;

    import java.util.Scanner;

public class Namegender{
=======
package src.com.vetias.java.workshop.basic;

import java.util.Scanner;

public class Namegender {
>>>>>>> fd2b7a0b34ef8ad720d975c4715b6db3df349389:src/com/vetias/java/workshop/basic/Namegender.java
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
<<<<<<< HEAD:src/main/java/com/vetias/workshop/basic/Namegender.java


=======
>>>>>>> fd2b7a0b34ef8ad720d975c4715b6db3df349389:src/com/vetias/java/workshop/basic/Namegender.java
