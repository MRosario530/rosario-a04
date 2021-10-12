package baseline;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class Solution41Test {

    @Test
    void testScanNamesListCreation() {
        Solution41 test = new Solution41();
        List<String> expectedResult = new ArrayList<>();
        expectedResult.add("Ling, Mai");
        expectedResult.add("Johnson, Jim");
        expectedResult.add("Zarnecki, Sabrina");
        expectedResult.add("Jones, Chris");
        expectedResult.add("Jones, Aaron");
        expectedResult.add("Swift, Geoffrey");
        expectedResult.add("Xiong, Fong");
        List<String> actualResult;
        actualResult = test.scanNames();
        assertEquals(expectedResult,actualResult);
    }

    @Test
    void testCreateNameListString() {
        Solution41 test = new Solution41();
        List<String> nameList;
        nameList = test.scanNames();
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
        StringBuilder actualResult = test.createNameListString(nameList);
        assertEquals(expectedResult,actualResult.toString());
    }
}