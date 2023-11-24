package org.collection;
import java.util.TreeSet;
import java.util.Set;

public class CommonValuesInTreeSets {
    public static void main(String[] args) {
        // First TreeSet
        Set<Integer> set1 = new TreeSet<>();
        set1.add(10);
        set1.add(20);
        set1.add(30);
        set1.add(40);
        set1.add(50);
        set1.add(60);
        set1.add(70);
        set1.add(80);

        // Second TreeSet
        Set<Integer> set2 = new TreeSet<>();
        set2.add(100);
        set2.add(200);
        set2.add(300);
        set2.add(400);
        set2.add(500);
        set2.add(600);
        set2.add(700);
        set2.add(800);

        // Find and print the common values
        Set<Integer> commonValues = new TreeSet<>(set1); // Copy the first set
        commonValues.retainAll(set2); // Keep only the common values

        System.out.println("Common values: " + commonValues);
    }
}
