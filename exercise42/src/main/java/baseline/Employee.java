/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class Employee {
    private final String lastName;
    private final String firstName;
    private final String salary;

    public Employee(String lastName, String firstName, String salary) {
        // Create a constructor and initialize each value to the instance variables.
        this.lastName = lastName;
        this.firstName = firstName;
        this.salary = salary;
    }

    @Override
    public String toString() {
        // Override the default toString with a new toString.
        StringBuilder tempString = new StringBuilder();
        // Format each value to be a certain distance away from each other in the string.
        Formatter formatter = new Formatter(tempString);
        // Keep the values left aligned.
        formatter.format("%-10s", lastName);
        formatter.format("%-10s", firstName);
        formatter.format("%s%n", salary);
        formatter.close();
        // Return the String.
        return tempString.toString();
    }
}
