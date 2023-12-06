package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
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
    private void signupButton(ActionEvent event ) throws IOException{
        String firstName = fName.getText();
        String lastName = lName.getText();
        String usr = username.getText();
        String pass = password.getText();
        ProjectApplication pa = ProjectApplication.getInstance();
        boolean ifWorked = pa.signUp(firstName, lastName, usr, pass);
        System.out.println("In signup Button " + ifWorked);
        pa.saveAll();
        if (ifWorked) {
            App.setRoot("project");
        } else {
            App.setRoot("signup");
        }
    }

    @FXML
    private void loginSwitch() throws IOException{
        App.setRoot("login");
    }

}