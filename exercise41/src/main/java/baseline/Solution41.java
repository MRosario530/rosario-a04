/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;
import java.io.*;

public class Solution41 {
    public static void main(String[] args) {
        // Create a Solution41 object
        // Create an arraylist of strings and call scanNames()
        // Create a stringbuilder and call createNameListString() with the previous arraylist
        // Call uploadListToFile() with the previously created stringbuilder
    }

    public ArrayList<String> scanNames() {
        // Create an arraylist of strings to hold each name.
        // Create a file object and path the object to exercise41_input.txt in the data folder
        // Loop through the file until the EOF is reached
            // Scan each line into the arraylist as its own string
        // Return the list
    }

    public StringBuilder createNameListString(ArrayList<String> nameList) {
        // Create a stringbuilder object
        // call sortByLastName on nameList
        // Create the top part of the string with "Total of nameList.length Names" followed by a line
        // Loop through the arraylist adding each object to the string
    }

    public void uploadListToFile(StringBuilder nameListString) {
        // Create a printwriter object and path it to exercise41_output.txt
        // Print the string into the file
    }

    private ArrayList<String> sortByLastName(ArrayList<String> nameList) {
        // Return the list having called the sort command on it
    }

}
