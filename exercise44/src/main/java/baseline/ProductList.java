/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class ProductList {
    private List<Product> products;

    public List<Product> getProducts() {
        // Return the product arraylist.
        return products;
    }

    // Note - This is not a do while loop due to the fact that it is easier to test if this method
    // takes the user's input and then returns a corresponding string.
    public String searchProducts(String search) {
        // Create a boolean to mark the result and a string to hold the result of the search.
        boolean exists = false;
        String searchResult = "";
        // Search the products array name id's for the user's input.
        for (Product p : products) {
            if (p.getName().equals(search)) {
                // If the product entered is valid, change the boolean to true.
                exists = true;
                // Adjust the searchResult string to the toString of the product.
                searchResult = p.toString();
            }
        }
        // If exists is false, print that the object does not exist and loop back to the top.
        if (!exists) {
            searchResult = "Sorry, that product was not found in our inventory.\n";
        }
        // Return the product toString
        return searchResult;
    }

    public void retrieveInventory(String path) {
        // Create a new InventoryRetriever object
        InventoryRetriever app = new InventoryRetriever();
        // Call getInventory with the path given and assign the result to the array of Products.
        products = app.retrieveInventory(path);
    }

}
