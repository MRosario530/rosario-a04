/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ProductListTest {

    @Test
    void testSearchProductsSomethingFound() {
        ProductList app = new ProductList();
        app.retrieveInventory("data/exercise44_input.json");
        String expectedResult = "Name: Thing\nPrice: 15.00\nQuantity: 5\n";
        assertEquals(expectedResult,app.searchProducts("Thing"));
    }

    @Test
    void testSearchProductsNothingFound() {
        ProductList app = new ProductList();
        app.retrieveInventory("data/exercise44_input.json");
        String expectedResult = "Sorry, that product was not found in our inventory.\n";
        assertEquals(expectedResult,app.searchProducts("hello"));
    }

    @Test
    void testRetrieveInventory() {
        ProductList app = new ProductList();
        app.retrieveInventory("data/exercise44_input.json");
        List<Product> expectedResult = new ArrayList<>();
        expectedResult.add(new Product("Widget", 25.00, 5));
        expectedResult.add(new Product("Thing", 15.00, 5));
        expectedResult.add(new Product("Doodad", 5.00, 10));
        assertEquals(expectedResult.toString(),app.getProducts().toString());
    }
}