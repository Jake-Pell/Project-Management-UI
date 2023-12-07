package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import library.App;

public class AccountCreatedController {
   
    
    @FXML
    private void switchToLogin(ActionEvent event) throws IOException{
        App.setRoot("login");
    }
}
