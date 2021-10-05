package edu.bsu.View;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;

public class GUIInputParser {
    public JSONArray parseJSON(InputStream dataStream) throws IOException {
        JSONArray jsonInput = JsonPath.read(dataStream, "$..query");
        DoesArticleExist(jsonInput);
        return jsonInput;
    }
    public void DoesArticleExist(JSONArray jsonInput){
        JSONArray jsonArray = JsonPath.read(jsonInput, "$..missing");
        System.err.println("Article not found");
        System.exit(2);
    }
}
