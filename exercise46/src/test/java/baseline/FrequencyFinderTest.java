package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FrequencyFinderTest {

    @Test
    void testRetrieveFileText() {
        FrequencyFinder app = new FrequencyFinder();
        app.retrieveFileText("data/exercise46_input.txt");
        String expectedResult = """
                badger badger badger
                badger mushroom
                mushroom snake badger badger
                badger""";
        assertEquals(expectedResult,app.getFileText().replace("\r", ""));
    }

    @Test
    void testCreateWordFrequencyHistogram() {
        FrequencyFinder app = new FrequencyFinder();
        app.retrieveFileText("data/exercise46_input.txt");
        String actualResult = app.createWordFrequencyHistogram();
        String expectedResult = """
                badger:   *******
                mushroom: **
                snake:    *
                """;
        assertEquals(expectedResult,actualResult);
    }
}