/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class InventoryRetriever {

    public List<Product> retrieveInventory(String path) {
        // Create a new ProductList
        ProductList inventory = new ProductList();
        // Create a try catch with a JsonReader and path it to the String path
        try (JsonReader reader = new JsonReader(new FileReader(path))) {
            // Create a json object and call fromJson with the wrapper class ProductList.
            Gson gson = new Gson();
            inventory = gson.fromJson(reader, ProductList.class);
        } catch(IOException e) {
            // Display an error message if file could not be parsed or retrieved.
            System.out.println("Error retrieving the inventory.");
        }
        // Return the list of products.
        return inventory.getProducts();
    }
}
