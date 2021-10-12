/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import java.util.*;
import java.io.*;

public class Solution41 {
    public static void main(String[] args) {
        // Create a Solution41 object
        Solution41 app = new Solution41();
        // Create an arraylist of strings and call scanNames()
        List<String> nameList = app.scanNames();
        // Create a stringbuilder and call createNameListString() with the previous arraylist
        StringBuilder nameListString = app.createNameListString(nameList);
        // Call uploadListToFile() with the previously created stringbuilder
        app.uploadListToFile(nameListString);
    }

    public List<String> scanNames() {
        // Create an arraylist of strings to hold each name.
        ArrayList<String> nameList = new ArrayList<>();
        // Create a file object and path the object to exercise41_input.txt in the data folder
        // Use a try-with-resources to ensure that all resources are closed
        try (BufferedReader br = new BufferedReader(new FileReader("data/exercise41_input.txt"))) {
            String currentName;
            // Loop through the file until the EOF is reached (Or null actually)
            while ((currentName = br.readLine()) != null) {
                // Scan each line into the arraylist as its own string
                nameList.add(currentName);
            }
        } catch (IOException e) {
            System.out.println("Error scanning in file.");
        }
        // Return the list
        return nameList;
    }

    public StringBuilder createNameListString(List<String> nameList) {
        // Create a stringbuilder object
        StringBuilder nameListString = new StringBuilder();
        // call sortByLastName on nameList
        sortByLastName(nameList);
        // Create the top part of the string with "Total of nameList.length Names" followed by a line
        nameListString.append("Total of ").append(nameList.size()).append(" names\n");
        nameListString.append("-----------------\n");
        // Loop through the arraylist adding each object to the string
        for (String s : nameList) {
            nameListString.append(s).append("\n");
        }
        // Return the completed string
        return nameListString;
    }

    public void uploadListToFile(StringBuilder nameListString) {
        // Create a file object to store the file/path to the output or create if necessary
        File file = new File("data/exercise41_output.txt");
        // Create a printwriter object and path it to exercise41_output.txt
        // Use a try-with-resources to ensure that all resources are closed
        try (PrintWriter writer = new PrintWriter(file)) {
            // Print the string into the file
            writer.write(String.valueOf(nameListString));
        } catch (IOException e) {
            System.out.println("Error writing to a file.");
        }
    }

    private void sortByLastName(List<String> nameList) {
        // Alter the list to be sorted
        Collections.sort(nameList);
    }

}
