package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FileConverterTest {

    @Test
    void testRetrieveFileText() {
        FileConverter app = new FileConverter();
        String actualResult = app.retrieveFileText("data/exercise46_input.txt");
        String expectedResult = """
                badger badger badger
                badger mushroom
                mushroom snake badger badger
                badger""";
        assertEquals(expectedResult,actualResult.replace("\r", ""));
    }
}