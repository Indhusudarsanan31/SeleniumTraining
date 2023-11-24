package org.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ListToSet {
    public static void main(String[] args) {
        List<Integer> inputList = new ArrayList<>();
        inputList.add(100);
        inputList.add(200);
        inputList.add(300);
        inputList.add(400);
        inputList.add(500);
        inputList.add(600);
        inputList.add(700);
        inputList.add(100);
        inputList.add(300);
        inputList.add(500);

        Set<Integer> resultSet = new HashSet<>();
        resultSet.addAll(inputList);

        System.out.println("Set after conversion: " + resultSet);
    }
}
