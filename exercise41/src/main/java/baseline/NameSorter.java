package baseline;

import java.io.*;
import java.util.*;

public class NameSorter {
    // Create an arraylist of strings to hold each name.
    private final ArrayList<String> nameList = new ArrayList<>();

    public NameSorter() {
        // Constructor implemented for SonarLint
    }

    public List<String> getNameList() {
        // Implemented for testing while keeping nameList private.
        return nameList;
    }

    public void scanNames(String path) {
        // Create a file object and path the object to exercise41_input.txt in the data folder
        // Use a try-with-resources to ensure that all resources are closed
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String currentName;
            // Loop through the file until the EOF is reached (Or null actually)
            while ((currentName = br.readLine()) != null) {
                // Scan each line into the arraylist as its own string
                nameList.add(currentName);
            }
        } catch (IOException e) {
            System.out.println("Error scanning in file.");
        }
    }

    public StringBuilder createNameListString() {
        // Create a stringbuilder object
        StringBuilder nameListString = new StringBuilder();
        // call sortByLastName on nameList
        sortByLastName();
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

    public void uploadListToFile(StringBuilder nameListString, String path) {
        // Create a file object to store the file/path to the output or create if necessary
        File file = new File(path);
        // Create a printwriter object and path it to exercise41_output.txt
        // Use a try-with-resources to ensure that all resources are closed
        try (PrintWriter writer = new PrintWriter(file)) {
            // Print the string into the file
            writer.write(String.valueOf(nameListString));
        } catch (IOException e) {
            System.out.println("Error writing to a file.");
        }
    }

    private void sortByLastName() {
        // Alter the list to be sorted
        Collections.sort(nameList);
    }
}
