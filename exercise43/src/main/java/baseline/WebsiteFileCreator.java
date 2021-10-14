/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.io.*;

public class WebsiteFileCreator {

    public void createWebsiteFile(String path, String websiteTitle, String author) {
        // Create a stringbuilder and assign the createWebsiteText to it
        StringBuilder websiteText = createWebsiteText(websiteTitle, author);
        // Call createFile with the path and stringbuilder for the website text
        createFile(path, websiteText.toString());
    }

    private StringBuilder createWebsiteText(String websiteTitle, String author) {
        // Create and initalize a stringbuilder object
        StringBuilder websiteText = new StringBuilder();
        // Add to the stringbuilder the initial doctype declaration, html tag and header tag.
        websiteText.append("<!DOCTYPE html>\n").append("<html>\n").append("\t<head>\n");
        // Add to the stringbuilder the initial title tag, the String title, and the close title tag
        websiteText.append("\t\t<title> ").append(websiteTitle).append(" </title>\n");
        // Add to the stringbuilder the meta tag with the String author within it.
        websiteText.append("\t\t<meta name=\"author\" content=\"").append(author).append("\">\n");
        // Add to the stringbuilder the closing header tag and html tag.
        websiteText.append("\t</head>\n").append("</html>");
        // Return the stringbuilder.
        return websiteText;
    }

    private void createFile(String path, String text) {
        // Create a file object and direct it to path.
        File file = new File(path);
        // Create a PrintWriter within a try-with-resources.
        try (PrintWriter writer = new PrintWriter(file)) {
            // Scan the text string into the file.
            writer.write(text);
            // Print out that the file was created at the path.
            System.out.println("Created " + path);
        } catch (IOException e) {
            // If an error occurs print to the console that an error has occurred.
            System.out.println("Error writing to a file.");
        }
    }

}
