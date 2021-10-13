/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;
import java.io.*;

public class EmployeeFileReader {
    public List<Employee> readFileForEmployees(String path) {
        List<Employee> employeeList = new ArrayList<>();
        // Create a buffered reader in a try-with-resources loop.
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String currentEmployee;
            // Loop every line until the end of the file.
            while ((currentEmployee = br.readLine()) != null) {
                // For every line scanned in, call csvParser on that string.
                String[] employeeInfo = csvParser(currentEmployee);
                // Use the values of the csvParser to create an employee object.
                Employee temp = new Employee(employeeInfo[0], employeeInfo[1], employeeInfo[2]);
                // Add the employee object to the list.
                employeeList.add(temp);
            }
        } catch (IOException e) {
            System.out.println("Error scanning in file.");
        }
        // Return the list.
        return employeeList;
    }

    private String[] csvParser(String employeeData) {
        // Use the split() method with a comma as the delimiter and return the String array.
        return employeeData.split(",",3);
    }

}
