package org.collection;
import java.util.HashMap;
import java.util.Map;

public class EmployeeData {
    public static void main(String[] args) {
        Map<String, String> employeeData = new HashMap<>();

        // Add key-value pairs for an employee
        employeeData.put("empId", "22127");
        employeeData.put("name", "Indhu Sudarsanan");
        employeeData.put("phone", "6369110781");
        employeeData.put("address", "123 Main St, City, State");
        employeeData.put("dob", "31-01-2000");
        employeeData.put("doj", "21-07-2021");
        employeeData.put("email", "indhusuresh881@gmail.com");
        employeeData.put("gender", "Female");
        employeeData.put("Sql", "SQL Developer");

        System.out.println("Employee ID: " + employeeData.get("empId"));
        System.out.println("Name: " + employeeData.get("name"));
        System.out.println("Phone: " + employeeData.get("phone"));
        System.out.println("Address: " + employeeData.get("address"));
        System.out.println("Date of Birth: " + employeeData.get("dob"));
        System.out.println("Date of Joining: " + employeeData.get("doj"));
        System.out.println("Email: " + employeeData.get("email"));
        System.out.println("Gender: " + employeeData.get("gender"));
        System.out.println("SQL Position: " + employeeData.get("Sql"));    }
}
