/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testToString() {
        Employee actualResult = new Employee("Jones","Aaron","46000");
        String expectedResult = "Jones     Aaron     46000\r\n";
        assertEquals(expectedResult,actualResult.toString());
    }
}