/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeFileReaderTest {

    @Test
    void testReadFileForEmployees() {
        EmployeeFileReader app = new EmployeeFileReader();
        List<Employee> actualResult = app.readFileForEmployees("data/employeegrouptestfile.txt");
        List<Employee> expectedResult = new ArrayList<>();
        expectedResult.add(new Employee("Jones","Aaron","46000"));
        expectedResult.add(new Employee("Zarnecki","Sabrina","51500"));
        assertEquals(expectedResult.toString(), actualResult.toString());
    }
}