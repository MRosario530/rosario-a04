package baseline;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteFileCreatorTest {
    @Test
    void testCreateWebsiteFile() throws IOException {
        WebsiteFileCreator test = new WebsiteFileCreator();
        Files.createDirectories(Path.of("data/website/websitefilecreatortest/"));
        String path = "data/website/websitefilecreatortest/index.html";
        test.createWebsiteFile(path, "Test", "testauthor");
        File testFile = new File(path);
        assertTrue(testFile.exists());
    }

    @Test
    void testCreateWebsiteFileText() throws IOException {
        WebsiteFileCreator test = new WebsiteFileCreator();
        Files.createDirectories(Path.of("data/website/websitefilecreatortest/"));
        String path = "data/website/websitefilecreatortest/index.html";
        test.createWebsiteFile(path, "Test", "testauthor");
        StringBuilder actualResult = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String currentLine;
            while ((currentLine = br.readLine()) != null) {
                actualResult.append(currentLine).append("\n");
            }
        } catch (IOException e) {
            System.out.println("Error scanning in file.");
        }
        String expectedResult = """
                <!DOCTYPE html>
                <html>
                \t<head>
                \t\t<title> Test </title>
                \t\t<meta name="author" content="testauthor">
                \t</head>
                </html>
                """;
        assertEquals(expectedResult,actualResult.toString());
    }
}