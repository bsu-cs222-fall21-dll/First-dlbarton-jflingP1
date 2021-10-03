package edu.bsu.Model;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLModifier {
    public String modifyUserInput (String userInput){
        String encodedURLString = null;
        try{
            encodedURLString = URLEncoder.encode(userInput, StandardCharsets.UTF_8.toString());
        } catch (UnsupportedEncodingException e){
            e.printStackTrace();
        }
        return encodedURLString;
    }
}
