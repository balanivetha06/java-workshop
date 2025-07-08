package src.com.vetias.java.workshop.basic;

import java.time.LocalTime;

public class RegestrationTimeleft {
     public static void main(String[] args) {
        LocalTime currentTime=LocalTime.now();
        LocalTime registrationEndTime =LocalTime.of(18,59,59);
        int hourleft=registrationEndTime.getHour()-currentTime.getHour();
        int minleft=registrationEndTime.getMinute()-currentTime.getMinute();
        int secleft=registrationEndTime.getSecond()-currentTime.getSecond();
        System.out.println("You have " +hourleft+"hours "+ minleft+"min "+secleft+"seconds left");

         }

}
