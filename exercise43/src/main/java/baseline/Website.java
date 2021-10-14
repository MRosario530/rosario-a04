/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.Scanner;

public class Website {
    private static final Scanner input = new Scanner(System.in);
    private static final String startPath = "data/website/";
    private String websiteTitle;
    private String author;
    private Boolean jsFolder;
    private Boolean cssFolder;

    public Website() {
        // Initialize a Website with empty strings and falses.
        websiteTitle = "";
        author = "";
        jsFolder = false;
        cssFolder = false;
    }

    // For testing purposes
    public void setWebsiteTitle(String websiteTitle) {
        this.websiteTitle = websiteTitle;
    }

    public void promptForWebsiteInfo() {
        // Prompt the user for the site name.
        System.out.print("Site name: ");
            // Change the instance variable title to this response.
        websiteTitle = input.nextLine();
        // Prompt the user for the author name.
        System.out.print("Author: ");
            // Change the instance variable author to this response.
        author = input.nextLine();
        // Prompt the user for if they want a folder for JavaScript.
            // If the user answers "y", set the instance variable jsFolder to true.
        jsFolder = getYesOrNo("Do you want a folder for JavaScript(y/n)? ");
        // Prompt the user for if they want a folder in CSS.
            // If the user answers "y", set the instance variable cssFolder to true.
        cssFolder = getYesOrNo("Do you want a folder for CSS(y/n)? ");
    }

    public void createWebsite() {
        // Create objects for WebsiteFileCreator and WebsiteDirectoryCreator
        WebsiteFileCreator file = new WebsiteFileCreator();
        WebsiteDirectoryCreator directory = new WebsiteDirectoryCreator();
        // Call createWebsiteDirectory.
        directory.createWebsiteDirectory(startPath + websiteTitle + "/");
        // Call createWebsiteFile.
        file.createWebsiteFile(startPath + websiteTitle + "/index.html", websiteTitle,author);
        // If jsFolder is true call createWebsiteDirectory(js).
        if (Boolean.TRUE.equals(jsFolder)) {
            directory.createWebsiteDirectory(startPath + websiteTitle + "/js/" );
        }
        // If cssFolder is true call createWebsiteDirectory(css).
        if (Boolean.TRUE.equals(cssFolder)) {
            directory.createWebsiteDirectory(startPath + websiteTitle + "/css/" );
        }
    }

    private Boolean getYesOrNo(String prompt) {
        // Create variables for storing the user's response.
        char userChoice;
        String tempInput = "";
        // While the user does not input a valid y/n, ask again.
        do {
            // Display the string prompt
            System.out.print(prompt);
            // Take the user's input and convert it to uppercase
            tempInput = input.next();
            tempInput = tempInput.toUpperCase();
            // Take the first character and set it as the user's choice
            userChoice = tempInput.charAt(0);
            // Check if the userChoice is equal to Y or N
        }while (userChoice != 'Y' && userChoice != 'N');
        return userChoice == 'Y';
    }
}
