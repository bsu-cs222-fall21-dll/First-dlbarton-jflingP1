package edu.bsu.testers;

import edu.bsu.Model.WikiRevisionParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

public class WikiRevisionParserTest {

    @Test
    public void testParse() throws IOException {
        WikiRevisionParser parser = new WikiRevisionParser();
        InputStream testDataStream = Thread.currentThread().getContextClassLoader().getResourceAsStream("test.json");
        String timestamp = parser.parse(testDataStream);
        Assertions.assertEquals("2021-01-25T00:14:46Z", timestamp);
    }
}
