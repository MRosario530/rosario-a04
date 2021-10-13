/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

public class Solution42 {
    public static void main(String[] args) {
        // Create an EmployeeGroup object
        EmployeeGroup app = new EmployeeGroup();
        // Create a list and call readFileForEmployees(path)
        app.readFileForEmployees("data/exercise42_input.txt");
        // Print the method createEmployeesDataString() to display the table of employees
        System.out.print(app.createEmployeesDataString());
    }
}
