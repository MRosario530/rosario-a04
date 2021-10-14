package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteDirectoryCreatorTest {

    @Test
    void testCreateWebsiteDirectory() {
        WebsiteDirectoryCreator test = new WebsiteDirectoryCreator();
        test.createWebsiteDirectory("data/website/websitetest/");
        File testFile = new File("data/website/websitetest/");
        assertTrue(testFile.exists());
    }
}