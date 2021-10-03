package edu.bsu.Model;

import edu.bsu.View.UserInput;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

public class Layout {
    public void endResult() throws IOException {

        AccessWikipedia accessWiki = new AccessWikipedia();
        UserInput userInput = new UserInput();
        URLModifier urlModifier = new URLModifier();
        WikiRevFormatter wikiRevFormatter = new WikiRevFormatter();
        WikiRevisionParser wikiRevisionParser = new WikiRevisionParser();

        String input = userInput.gainUserInput();
        String modifyString = urlModifier.modifyUserInput(input);
        String URL = accessWiki.makeURL(modifyString);
        String result = accessWiki.readURL(URL);

        System.out.println(result);

        InputStream inputStreamRedirect = new ByteArrayInputStream(result.getBytes(StandardCharsets.UTF_8));
    }

}
