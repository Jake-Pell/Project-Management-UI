package controllers;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
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
    private Text LoginSwitch;

    @FXML
    void Login(MouseEvent event) throws IOException {
        App.setRoot("login");
    }

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
            App.setRoot("accountCreated");
        } else {
            App.setRoot("signup");
        }
    }

    private void switchToLogin() throws IOException {
        App.setRoot("login");
    }

}