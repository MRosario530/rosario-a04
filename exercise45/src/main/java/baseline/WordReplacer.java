/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

public class WordReplacer {
    private String inputString;

    public String getInputString() {
        // Returns the instance variable inputString.
    }

    public void retrieveInputFile(String path) {
        // Create a string and call the Files readString(path).
        // Assign the string to the inputString instance variable.
    }

    public void writeReplaceToFile(String wordToReplace, String wordReplacement, String fileName) {
        // Create a path string that begins with data/ and attach the file name and .txt to the string.
        // Create a file using the above path directory.
        // Create a string and call replaceWords(wordToReplace, wordReplacement).
        // Create a try-with-resources with a FileWriter within the object.
            // Print the string to the FileWriter destination.
        // Have the catch print an error message.
    }

    private String replaceWords(String wordToReplace, String wordReplacement) {
        // Call replace() on the inputString with the wordToReplace and wordReplacement as the parameters.
        // Return the resulting string.
    }

}
