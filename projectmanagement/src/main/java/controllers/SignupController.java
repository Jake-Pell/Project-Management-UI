package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import library.App;

public class SignupController {


    @FXML
    private TextField txtsignup;


    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("login");
    }

    @FXML
    private void signupButton() throws IOException{
        System.out.println(txtsignup.getText());
        App.setRoot("project");
    }

    @FXML
    private void onClick() throws IOException{

    }
}