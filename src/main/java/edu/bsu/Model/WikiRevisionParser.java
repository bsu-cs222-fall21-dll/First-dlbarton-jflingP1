package edu.bsu.Model;

import com.jayway.jsonpath.JsonPath;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import static com.jayway.jsonpath.JsonPath.read;

public class WikiRevisionParser {

    public String parse(InputStream testDataStream) throws IOException {
        JSONArray result = (JSONArray) JsonPath.read(testDataStream, "$..timestamp");
        return result.get(0).toString();
    }

    public ArrayList<WikiRevision> addRevisions(InputStream testDataStream) throws IOException{

        ArrayList<WikiRevision> revisionList = new ArrayList<>();

        JSONArray revisionsJSONArray = read(testDataStream, "$..revisions[0:]");

        for (int i = 0; i < revisionsJSONArray.size(); i++){
            JSONArray author = read(revisionsJSONArray, "$..user");
            JSONArray timestamp = JsonPath.read(revisionsJSONArray, "$..timestamp");
            WikiRevision wikiRevision = new WikiRevision((author.get(i).toString()), timestamp.get(i).toString());
            revisionList.add(wikiRevision);
        }
        return revisionList;
    }

}
