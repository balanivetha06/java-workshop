
package com.vetias.workshop.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListofMark {
    public static void main(String[] args) {
        List<Integer> marks =new ArrayList<>();
        marks.add(50);
        marks.add(90);
        marks.add(70);
        marks.add(50);
        marks.add(80);
        marks.add(60);
        Collections.sort(marks);
        System.out.println("Sorted List of marks in ascending:"+ marks);
        Collections.sort(marks,Collections.reverseOrder());
        System.out.println("Sorted List of marks in descending:"+ marks);
        System.out.println("Minimum marks:" + Collections.min(marks));
        System.out.println("Maximum mark:"+ Collections.max(marks));
        
    }

}

