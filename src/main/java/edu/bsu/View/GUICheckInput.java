package edu.bsu.View;

import javafx.scene.control.Alert;

public class GUICheckInput {

    public void checkInput(String userInput){
        if (userInput == null || userInput.isEmpty() || userInput.trim().isEmpty()){
            Alert.AlertType alertType = Alert.AlertType.WARNING;
            Alert alert = new Alert(alertType, "Enter Article Name again");
            alert.showAndWait();
        }
    }
}
