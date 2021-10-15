/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.Scanner;

public class Solution44 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Create a ProductList object.
        ProductList app = new ProductList();
        // Call getInventory with the path to exercise44_input.json.
        app.retrieveInventory("data/exercise44_input.json");
        // Create a base String for the search result.
        String searchResult = "Sorry, that product was not found in our inventory.";
        // Create an if for the case that there was nothing in the json file.
        if (app.getProducts().isEmpty()) {
            System.out.println("There's nothing in the inventory!");
        } else {
            while (searchResult.equals("Sorry, that product was not found in our inventory.")) {
                // Otherwise prompt the user for the product and retrieve whether the product is in the inventory.
                System.out.print("What is the product name? ");
                String userInput = input.nextLine();
                searchResult = app.searchProducts(userInput);
                System.out.print(searchResult);
            }
        }
    }
}
