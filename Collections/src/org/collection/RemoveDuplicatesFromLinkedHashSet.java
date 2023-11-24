package org.collection;
import java.util.LinkedHashSet;

public class RemoveDuplicatesFromLinkedHashSet {
    public static void main(String[] args) {
        int[] a = {10, 10, 20, 50, 60, 80, 60, 50};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : a) {
            set.add(num);
        }

        Integer[] resultArray = set.toArray(new Integer[0]);

        System.out.print("Output a[] = {");
        for (int i = 0; i < resultArray.length; i++) {
            System.out.print(resultArray[i]);
            if (i < resultArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
}
