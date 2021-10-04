package edu.bsu.testers;

import edu.bsu.Model.AccessWikipedia;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccessWikipediaTest {

    @Test
    public void testMakeUrl(){
        AccessWikipedia accessWikipedia = new AccessWikipedia();
        Assertions.assertEquals("https://en.wikipedia.org/w/api.php?action=query&prop=revisions&format=json&rvprop=timestamp%7Cuser&rvlimit=30&titles=Frank+Zappa&redirects", accessWikipedia.makeURL("Frank+Zappa"));
    }
}
