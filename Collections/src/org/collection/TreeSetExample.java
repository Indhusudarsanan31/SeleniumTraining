package org.collection;
import java.util.TreeSet;
import java.util.List;
import java.util.Set;
import java.util.Arrays;

public class TreeSetExample {
    public static void main(String[] args) {
    	
       Set<Integer> uniqueSet = new TreeSet<Integer>();
       
       uniqueSet.add(10);
       uniqueSet.add(20);
       uniqueSet.add(30);
       uniqueSet.add(40);
       uniqueSet.add(50);
       uniqueSet.add(60);
       uniqueSet.add(70);
       uniqueSet.add(80);
       uniqueSet.add(90);
       uniqueSet.add(10);
       uniqueSet.add(20);


        System.out.println("TreeSet values: " + uniqueSet);
    }
}
