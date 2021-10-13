/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
// Only one class was created for this exercise because I did not feel justified creating multiple
// single method classes for reading in a file, sorting a file, translating the file into a string, and
// pushing that string into another file.
package baseline;

public class Solution41 {
    public static void main(String[] args) {
        // Create a NameSorter object
        NameSorter app = new NameSorter();
        // Call the method scanNames(path) to scan in all strings from a location into an arraylist
        app.scanNames("data/exercise41_input.txt");
        // Create a stringbuilder and call createNameListString() using the arraylist in the NameSorter
        // object.
        StringBuilder nameListString = app.createNameListString();
        // Call uploadListToFile(nameListString, path) with the previously created nameListString and the location
        // to print to.
        app.uploadListToFile(nameListString, "data/exercise41_output.txt");
    }

}
