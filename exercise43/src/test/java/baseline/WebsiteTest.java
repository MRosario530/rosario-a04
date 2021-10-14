package baseline;

import org.junit.jupiter.api.Test;

import java.io.File;

import static org.junit.jupiter.api.Assertions.*;

class WebsiteTest {
    @Test
    void testCreateWebsite() {
        Website test = new Website();
        test.setWebsiteTitle("websitetest");
        test.createWebsite();
        File testFile = new File("data/website/websitetest/index.html");
        assertTrue(testFile.exists());
    }
}