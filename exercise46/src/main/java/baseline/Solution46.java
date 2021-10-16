/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

public class Solution46 {
    public static void main(String[] args) {
        // Create a FrequencyFinder object.
        FrequencyFinder app = new FrequencyFinder();
        // Call FrequencyFinder's retrieveFileText with the path "data/exercise46_input.txt".
        app.retrieveFileText("data/exercise46_input.txt");
        // Call FrequencyFinder's displayWordFrequencyHistogram() and print the result.
        System.out.print(app.createWordFrequencyHistogram());
    }
}
