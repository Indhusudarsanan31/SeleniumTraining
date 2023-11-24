package org.collection;
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;

public class HashSetExample {
    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90, 10, 20);

        HashSet<Integer> uniqueSet = new HashSet<>(inputList);

        System.out.println("HashSet values: " + uniqueSet);
    }
}
