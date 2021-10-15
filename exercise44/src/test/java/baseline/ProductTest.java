/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {

    @Test
    void testToString() {
        Product app = new Product("Thing",15.00,5);
        String expectedResult = "Name: Thing\nPrice: 15.00\nQuantity: 5\n";
        assertEquals(expectedResult,app.toString());
    }
}