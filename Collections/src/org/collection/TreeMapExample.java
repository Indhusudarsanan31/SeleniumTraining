package org.collection;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer, Character> treeMap = new TreeMap<>();

        // Add key-value pairs to the TreeMap
        treeMap.put(10, '!');
        treeMap.put(20, '@');
        treeMap.put(30, '#');
        treeMap.put(40, '$');
        treeMap.put(50, '%');
        treeMap.put(60, '^');
        treeMap.put(10, '&');
        treeMap.put(50, '*');
        treeMap.put(40, '(');

        // Print the TreeMap
        System.out.println("TreeMap: " + treeMap);
    }
}
