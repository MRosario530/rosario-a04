/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

public class Website {
    private String title;
    private String author;
    private Boolean jsFolder;
    private Boolean cssFolder;

    public Website() {
        // Initialize a Website with empty strings and falses.
    }

    public void promptForWebsiteInfo() {
        // Prompt the user for the site name.
            // Change the instance variable title to this response.
        // Prompt the user for the author name.
            // Change the instance variable author to this response.
        // Prompt the user for if they want a folder for JavaScript.
            // If the user answers "y", set the instance variable jsFolder to true.
        // Prompt the user for if they want a folder in CSS.
            // If the user answers "y", set the instance variable cssFolder to true.
    }

    public void createWebsite() {
        // Call createWebsiteDirectory.
        // Call createWebsiteFile.
        // If jsFolder is true call createFolderDirectory(js).
        // If cssFolder is true call createFolderDirectory(css).
    }

    private void createWebsiteFile() {
        // Create FileCreator object.
        // Create a String with the path data/website/title/index.html.
        // Create a stringbuilder and call createWebsiteText;
        // Call createFile with the path and stringbuilder for the website text
        // Print out that the file was created at the path.
    }

    private void createWebsiteDirectory() {
        // Create FileCreator object
        // Create an initial String with the first part of the path data/
        // Create a secondary String with the rest of the path
            // ./website/title
        // Call createDirectory using a combination of the two strings
        // Print out that the directory was created.
    }

    private void createFolderDirectory(String folderName) {
        // Create FileCreator object
        // Create an initial String with the first part of the path data/
        // Create a secondary String with the rest of the path
            // ./website/title/folderName/
        // Call createDirectory using a combination of the two strings
        // Print out that the directory was created.
    }

    private StringBuilder createWebsiteText() {
        // Create and initalize a stringbuilder object
        // Add to the stringbuilder the initial doctype declaration, html tag and header tag.
        // Add to the stringbuilder the initial title tag, the instance variable title, and the close title tag
        // Add to the stringbuilder the meta tag with the author name within it.
        // Add to the stringbuilder the closing header tag and html tag.
        // Return the stringbuilder.
    }
}
