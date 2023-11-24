package org.collection;

import java.util.Hashtable;
import java.util.Enumeration;

public class HashtablePrintKeys {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put("sam", "Selenium");
        hashtable.put("Karthik", "framework");
        hashtable.put("Gowtham", "oracle");
        hashtable.put("Gokul", "corejava");
        hashtable.put("neethu", "jira");

        // Print the keys in the Hashtable
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            System.out.println("Key: " + key);
        }
    }
}
