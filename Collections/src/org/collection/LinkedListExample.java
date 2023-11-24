package org.collection;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        // Create a new LinkedList and add the values to it
        List<Integer> myList = new LinkedList<>();
        myList.add(100);
        myList.add(200);
        myList.add(300);
        myList.add(400);
        myList.add(500);
        myList.add(600);
        myList.add(700);

        // Find the size of the LinkedList
        int size = myList.size();

        System.out.println("The size of the LinkedList is: " + size);
    }
}
