/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;

public class FrequencyFinder {
    private String fileText;
    private final Map<String,Integer> wordCounts = new HashMap<>();

    public String getFileText() {
        // Returns the instance variable fileText.
        return fileText;
    }

    public void retrieveFileText(String path) {
        // Create a FileConverter object.
        FileConverter app = new FileConverter();
        // Call the FileConverter's retrieveFileText with the path and set the result to the instance variable
        // fileText.
        fileText = app.retrieveFileText(path);
    }

    public String createWordFrequencyHistogram() {
        // Call retrieveWordCounts to create a map with all the words and their counts.
        retrieveWordCounts();
        // Create a new arraylist using the entryset() method of wordCounts.
        List<Map.Entry<String, Integer>> listOfWordCounts = new ArrayList<>(wordCounts.entrySet());
        // Sort the list using the values.
        listOfWordCounts.sort(Map.Entry.comparingByValue());
        Collections.reverse(listOfWordCounts);
        // Create a StringBuilder object with a formatter to hold the entire histogram.
        StringBuilder wordHistogram = new StringBuilder();
        Formatter formatter = new Formatter(wordHistogram);
        // Create a loop to cycle through the entire arraylist.
        for (Map.Entry<String, Integer> currentWord : listOfWordCounts) {
            // Add to the StringBuilder the key formatted to be left shifted with spaces afterwords.
            formatter.format("%-10s",currentWord.getKey() + ":");
            // Then use repeat to add value amount of "*" to the Stringbuilder.
            wordHistogram.append("*".repeat(Math.max(0, currentWord.getValue())));
            // Add a newline to the end of the row.
            wordHistogram.append("\n");
        }
        formatter.close();
        // Return the string.
        return wordHistogram.toString();
    }

    private void retrieveWordCounts() {
        // Create a string array and split the fileText string by spaces and newlines.
        String[] splitFileText = fileText.split("\s+|\r?\n");
        // Loop through the array, checking if wordCounts has a key that matches.
        for (String currentWord : splitFileText) {
            if (wordCounts.containsKey(currentWord)) {
                // If there is a matching key, add 1 to the value of that key.
                wordCounts.put(currentWord,wordCounts.get(currentWord)+1);
            } else {
                // Otherwise add a new element to the map with the word as the key and a value of 1.
                wordCounts.put(currentWord,1);
            }
        }
    }
}
