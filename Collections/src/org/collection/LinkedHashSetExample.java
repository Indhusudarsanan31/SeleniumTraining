package org.collection;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<Integer> inputList = new LinkedHashSet<Integer>();
     
        inputList.add(10);
        inputList.add(20);
        inputList.add(30);
        inputList.add(40);
        inputList.add(50);
        inputList.add(60);
        inputList.add(70);
        inputList.add(80);
        inputList.add(90);
        inputList.add(10);
        inputList.add(20);
        System.out.println(inputList);

        
    }
}
