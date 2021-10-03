package edu.bsu.Model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;

public class WikiNoSearch {
    public void noWikiArticleFound(InputStream dataStream) throws IOException{
        try {
            JSONArray result = JsonPath.read(dataStream, "$..missing");
            String checkForPage = result.get(0).toString();
            System.err.println("Page does not exist.");
            System.exit(2);
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException){
            ;
        }
    }
}
