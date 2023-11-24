package org.collection;
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Map;

public class HashtableWithWhileLoop {
    public static void main(String[] args) {
        Hashtable<String, String> hashtable = new Hashtable<>();

        // Add key-value pairs to the Hashtable
        hashtable.put("sam", "Selenium");
        hashtable.put("Karthik", "framework");
        hashtable.put("Gowtham", "oracle");
        hashtable.put("Gokul", "corejava");
        hashtable.put("neethu", "jira");

        // Iterate and print key-value pairs using a while loop
        Enumeration<String> keys = hashtable.keys();
        while (keys.hasMoreElements()) {
            String key = keys.nextElement();
            String value = hashtable.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
    }
}
