/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeGroupTest {

    @Test
    void testReadFileForEmployees() {
        EmployeeGroup app = new EmployeeGroup();
        app.readFileForEmployees("data/employeegrouptestfile.txt");
        List<Employee> expectedResult = new ArrayList<>();
        expectedResult.add(new Employee("Jones","Aaron","46000"));
        expectedResult.add(new Employee("Zarnecki","Sabrina","51500"));
        assertEquals(expectedResult.toString(), app.getEmployeeList().toString());
    }

    @Test
    void testCreateEmployeesDataString() {
        EmployeeGroup app = new EmployeeGroup();
        app.readFileForEmployees("data/exercise42_input.txt");
        StringBuilder actualResult = app.createEmployeesDataString();
        String expectedResult = """
                Last      First     Salary
                --------------------------
                Ling      Mai       55900
                Johnson   Jim       56500
                Jones     Aaron     46000
                Jones     Chris     34500
                Swift     Geoffrey  14200
                Xiong     Fong      65000
                Zarnecki  Sabrina   51500
                """;
        assertEquals(expectedResult,actualResult.toString().replace("\r", ""));
    }
}