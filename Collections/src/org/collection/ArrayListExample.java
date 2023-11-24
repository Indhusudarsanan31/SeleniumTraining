package org.collection;
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        // Create a new ArrayList and add the values to it
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(20);
        myList.add(30);
        myList.add(90);
        myList.add(10);
        myList.add(10);
        myList.add(40);
        myList.add(50);

        // Find the size of the ArrayList
        int size = myList.size();

        System.out.println("The size of the ArrayList is: " + size);
    }
}
