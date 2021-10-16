/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileConverter {
    public String retrieveFileText(String path) {
        // Create a string to hold the file text.
        String stringFromFile = "";
        // call the Files readString(path) with a try-catch statement.
        try {
            stringFromFile = Files.readString(Path.of(path));
        } catch(IOException e) {
            // Print an error if no string could be assigned.
            System.out.println("Error retrieving file input.");
        }
        // Return the string.
        return stringFromFile;
    }
}
