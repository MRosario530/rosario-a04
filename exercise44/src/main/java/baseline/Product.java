/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.text.DecimalFormat;

public class Product {
    private final String name;
    private final double price;
    private final int quantity;

    public Product(String name, double price, int quantity) {
        // Construct a Product object with the name, price, and quantity.
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        // Return a string of the instance variable name.
        return this.name;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("#.00");
        // Create a string object and add to it:
        // Name: instance variable name.
        return "Name: " + name + "\n" +
                // Price: instance variable price.
                "Price: " + df.format(price) + "\n" +
                // Quantity: instance variable quantity.
                "Quantity: " + quantity + "\n";
    }
}