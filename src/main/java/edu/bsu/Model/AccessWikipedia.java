package edu.bsu.Model;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ConnectException;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;

public class AccessWikipedia {
    public String makeURL(String articleSearch) {
        String urlFront = "https://en.wikipedia.org/w/api.php?action=query&format=json&prop=revisions&titles=";
        String urlEnd = "&redirects=";
        String urlFull;
        urlFull = urlFront + articleSearch + urlEnd;
        return urlFull;
    }
     public String readURL(String url) throws IOException {
        URL articleSearch = new URL(url);
         URLConnection connection = articleSearch.openConnection();
         connection.setRequestProperty("User-Agent", "CS222FP/0.1 (jfling@bsu.edu)");

         try {
             connection.connect();
         }
         catch(ConnectException | UnknownHostException connectionException){
             System.err.println("Network error:");
             System.exit(3);
         }
         BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream()));

         String inputLine = input.readLine();
         input.close();
         return inputLine;
     }
}

