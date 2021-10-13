/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class EmployeeGroup {
    private List<Employee> employeeList;

    public List<Employee> getEmployeeList() {
        // Returns the private employeeList (method mainly for testing).
        return employeeList;
    }

    public void readFileForEmployees(String path) {
        // Create an EmployeeFileReader object.
        EmployeeFileReader app = new EmployeeFileReader();
        // Call readFileForEmployees with the given path and assign the result to the
        // employeeList.
        employeeList = app.readFileForEmployees(path);
    }

    public StringBuilder createEmployeesDataString() {
        // Create a Stringbuilder object
        StringBuilder employeesDataString = new StringBuilder();
        // Create the top part of the employeesDataString with "Last First Salary" followed by a line
        employeesDataString.append("Last      First     Salary\n").append("--------------------------\n");
        // Loop through every element of the employeelist.
        for (Employee employee : employeeList) {
            // Add each employee to the Stringbuilder using each employee's toString
            employeesDataString.append(employee);
        }
        // Return the completed Stringbuilder.
        return employeesDataString;
    }

}
