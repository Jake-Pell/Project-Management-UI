package controllers;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import library.App;
import model.ProjectApplication;

public class SignupController {

    @FXML
    private TextField fName;

    @FXML
    private TextField lName;

    @FXML
    private TextField password;

    @FXML
    private TextField username;

    @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("login");
    }

    @FXML
    private void signupButton() throws IOException{
        String firstName = fName.getText();
        String lastName = lName.getText();
        String usr = username.getText();
        String pass = password.getText();
        ProjectApplication pa = ProjectApplication.getInstance();
        pa.signUp(pass, pass, usr, pass)
        App.setRoot("project");
    }

    @FXML
    private void onClick() throws IOException{

    }
}