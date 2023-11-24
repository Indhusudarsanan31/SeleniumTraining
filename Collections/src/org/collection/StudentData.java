package org.collection;
import java.util.HashMap;
import java.util.Map;

public class StudentData {
    public static void main(String[] args) {
        Map<String, String> studentData = new HashMap<>();

        // Add key-value pairs for a student
        studentData.put("stdId", "12345");
        studentData.put("stdName", "Indhu Shankar");
        studentData.put("stdPhone", "9876543210");
        studentData.put("address", "123 Elm St, Town, Country");
        studentData.put("dob", "13-12-1999");
        studentData.put("email", "indhushankar1331@yahoo.com");
        studentData.put("gender", "Female");

        // Retrieve and print student information
        System.out.println("Student ID: " + studentData.get("stdId"));
        System.out.println("Student Name: " + studentData.get("stdName"));
        System.out.println("Phone: " + studentData.get("stdPhone"));
        System.out.println("Address: " + studentData.get("address"));
        System.out.println("Date of Birth: " + studentData.get("dob"));
        System.out.println("Email: " + studentData.get("email"));
        System.out.println("Gender: " + studentData.get("gender"));
    }
}
