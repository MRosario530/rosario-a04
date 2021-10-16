package baseline;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WordReplacerTest {

    @Test
    void testRetrieveInputFile() {
        WordReplacer app = new WordReplacer();
        app.retrieveInputFile("data/exercise45_testinput.txt");
        String expectedResult = "use use use use utilize utilize utilize";
        assertEquals(expectedResult,app.getInputFileText());
    }

    @Test
    void testWriteReplaceToFile() {
        WordReplacer app = new WordReplacer();
        app.retrieveInputFile("data/exercise45_testinput.txt");
        app.writeReplaceToFile("utilize", "use", "exercise45_testoutput");
        String actualResult = "";
        try {
            actualResult = Files.readString(Path.of("data/exercise45_testoutput.txt"));
        } catch(IOException e) {
            actualResult = "Error!";
        }
        String expectedResult = "use use use use use use use";
        assertEquals(expectedResult,actualResult);
    }
}