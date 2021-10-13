/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Miguel Rosario
 */
package baseline;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NameSorterTest {

    @Test
    void testScanNamesFromFile() {
        NameSorter test = new NameSorter();
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Ling, Mai");
        expectedResult.add("Johnson, Jim");
        expectedResult.add("Zarnecki, Sabrina");
        expectedResult.add("Jones, Chris");
        expectedResult.add("Jones, Aaron");
        expectedResult.add("Swift, Geoffrey");
        expectedResult.add("Xiong, Fong");
        test.scanNames("data/exercise41_input.txt");
        assertEquals(expectedResult,test.getNameList());
    }

    @Test
    void testCreateNameListString() {
        NameSorter test = new NameSorter();
        test.scanNames("data/exercise41_input.txt");
        String expectedResult = """
                Total of 7 names
                -----------------
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina
                """;
        StringBuilder actualResult = test.createNameListString();
        assertEquals(expectedResult,actualResult.toString());
    }

    @Test
    void testUploadListToFile() {
        String expectedResult = """
                Total of 7 names
                -----------------
                Johnson, Jim
                Jones, Aaron
                Jones, Chris
                Ling, Mai
                Swift, Geoffrey
                Xiong, Fong
                Zarnecki, Sabrina
                """;
        NameSorter test = new NameSorter();
        test.scanNames("data/exercise41_input.txt");
        StringBuilder result = test.createNameListString();
        test.uploadListToFile(result,"data/exercise41_testoutput.txt");
        StringBuilder actualResult = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader("data/exercise41_testoutput.txt"))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                actualResult.append(currentLine).append("\n");
            }
        } catch (IOException e) {
            actualResult.append("Error scanning in file.");
        }
        assertEquals(expectedResult,actualResult.toString());
    }

}