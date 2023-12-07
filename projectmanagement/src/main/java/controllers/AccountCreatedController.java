package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import library.App;

public class AccountCreatedController {
   
    @FXML
    private void switchToLogin(ActionEvent event) throws IOException{
        App.setRoot("login");
    }

}
