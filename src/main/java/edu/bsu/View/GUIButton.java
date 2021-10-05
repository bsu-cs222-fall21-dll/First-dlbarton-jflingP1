package edu.bsu.View;

import javafx.scene.control.TextField;
import net.minidev.json.JSONArray;

import java.io.IOException;
import java.io.InputStream;

public class GUIButton {
    public JSONArray getParseJSON(TextField input) throws IOException {
        GUIButton guiButton = new GUIButton();
        JSONArray jsonArray;

        jsonArray = getParseJSON((input));
        return jsonArray;
    }
}
