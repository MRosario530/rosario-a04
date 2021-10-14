/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WebsiteDirectoryCreator {

    public void createWebsiteDirectory(String path){
        // Create a try catch statement.
        try {
            // Attempt to call createDirectories with the string Path.
            Files.createDirectories(Path.of(path));
            // Print out that the directory was created.
            System.out.println("Created " + path);
        } catch (IOException e) {
            // Print that there was an error creating the directory if an IOException occurs.
            System.out.println("Error creating directory");
        }
    }
}
