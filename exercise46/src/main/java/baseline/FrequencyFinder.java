/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.Map;

public class FrequencyFinder {
    private String fileText;
    private Map<String,Integer> wordCounts;

    public void retrieveFileText(String path) {
        // Create a FileConverter object.
        // Call the FileConverter's retrieveFileText with the path and set the result to the instance variable
        // fileText.
    }

    public String displayWordFrequencyHistogram() {
        // Call retrieveWordCounts to create a map with all the words and their counts.
        // Create a new arraylist using the entryset() method of wordCounts.
        // Sort the list using the values.
        // Create a StringBuilder object to hold the entire histogram.
        // Create a loop to cycle through the entire arraylist.
            // Add to the StringBuilder the key formatted to be left shifted with spaces afterwords.
            // Then create a loop to add value amount of "*" to the Stringbuilder.
            // Add a newline to the end of the row.
        // Return the string.
    }

    private void retrieveWordCounts() {
        // Create a string array and split the fileText string by spaces.
        // Loop through the array, checking if wordCounts has a key that matches.
            // If there is a matching key, add 1 to the value of that key.
            // Otherwise add a new element to the map with the word as the key and a value of 1.
    }

}
