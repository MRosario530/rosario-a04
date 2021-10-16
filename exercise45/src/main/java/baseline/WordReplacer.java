/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class WordReplacer {
    private String inputFileText;

    public String getInputFileText() {
        // Returns the instance variable inputFileText.
        return inputFileText;
    }

    public void retrieveInputFile(String path) {
        // Create a string to hold the file text.
        String stringFromFile = "";
        // call the Files readString(path) with a try-catch statement.
        try {
            stringFromFile = Files.readString(Path.of(path));
        } catch(IOException e) {
            System.out.println("Error retrieving file input.");
        }
        // Assign the string to the inputFileText instance variable.
        inputFileText = stringFromFile;
    }

    public void writeReplaceToFile(String wordToReplace, String wordReplacement, String fileName) {
        // Create a path string that begins with data/ and attach the file name and .txt to the string.
        String path = "data/" + fileName + ".txt";
        // Create a file using the above path directory.
        File file = new File(path);
        // Create a string and call replaceWords(wordToReplace, wordReplacement).
        String newFileText = replaceWords(wordToReplace, wordReplacement);
        // Create a try-with-resources with a FileWriter within the object.
        try (FileWriter writer = new FileWriter(file)) {
            // Print the string to the FileWriter destination.
            writer.write(newFileText);
        } catch (IOException e) {
            // Have the catch print an error message.
            System.out.println("Error outputting text to a file.");
        }
    }

    private String replaceWords(String wordToReplace, String wordReplacement) {
        // Call replace() on the inputFileText with the wordToReplace and wordReplacement as the parameters.
        // Return the resulting string.
        return inputFileText.replace(wordToReplace,wordReplacement);
    }

}
