/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
// For this program I opted to only use 1 class due to the fact that the program essentially does 3 things:
// Read all words from a file into a string, replace every instance of word1 with word2, and prints the new string into
// a new file. It would not make sense to have 3 classes each with one method.
package baseline;

import java.util.Scanner;

public class Solution45 {
    private static final Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // Create a WordReplacer object.
        WordReplacer app = new WordReplacer();
        // Call retrieveInputFile(exercise45_input.txt).
        app.retrieveInputFile("data/exercise45_input.txt");
        String fileName;
        do {
            // Prompt the user to enter a file name and store it to a string.
            System.out.print("Please enter the name of the file you would like to output the result to (.txt will be" +
                            " added automatically): ");
            // Ensure that the user's input is not blank - If so, prompt the user again.
            fileName = input.nextLine();
        } while(fileName.isBlank());
        // Call writeReplaceToFile("utilize", "use", file name).
        app.writeReplaceToFile("utilize", "use", fileName);
    }
}
