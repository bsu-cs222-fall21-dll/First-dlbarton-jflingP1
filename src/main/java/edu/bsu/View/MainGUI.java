package edu.bsu.View;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainGUI extends Application {
    @Override
    public void start(Stage mainStage) {
        VBox parent = new VBox();
        parent.setAlignment(Pos.TOP_CENTER);
        parent.setSpacing(12);
        parent.getChildren().add(new Label("Wiki Article Revision Parser"));

        HBox urlInput = new HBox(new Label("Enter Article Name:"));
        urlInput.setAlignment(Pos.BASELINE_CENTER);

        TextField inputText = new TextField();
        urlInput.getChildren().add(inputText);

        TextArea output = new TextArea();
        output.setPrefSize(300,300);
        output.setMaxSize(500,500);

        parent.getChildren().add(urlInput);

        Button search = new Button("Search");
        search.setOnAction(event -> {

            GUIButton guiSearchButton = new GUIButton;
            UserInterface userInterface
        }
    }
}
