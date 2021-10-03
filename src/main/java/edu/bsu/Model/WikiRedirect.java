package edu.bsu.Model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;

public class WikiRedirect {
    public String redirectChecker(InputStream dataStream) throws IOException{
        try {
            JSONArray result = JsonPath.read(dataStream, "$..redirects");
            JSONArray redirecter = JsonPath.read(result, "$..to");
            String redirectMessage = "Redirected to " + redirecter.get(0).toString() + ".";
            return redirectMessage;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException){}
        return "";
    }
}
