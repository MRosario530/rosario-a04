/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class InventoryRetrieverTest {

    @Test
    void testRetrieveInventory() {
        InventoryRetriever app = new InventoryRetriever();
        List<Product> expectedResult = new ArrayList<>();
        expectedResult.add(new Product("Widget", 25.00, 5));
        expectedResult.add(new Product("Thing", 15.00, 5));
        expectedResult.add(new Product("Doodad", 5.00, 10));
        assertEquals(expectedResult.toString(),app.retrieveInventory("data/exercise44_input.json").toString());
    }
}